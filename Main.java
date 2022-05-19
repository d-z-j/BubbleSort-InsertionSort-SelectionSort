public class Main {
    public static void main(String[] args) {
        int[] arr = {8,5,0,1,4,9,2,3,6,7};      //测试用例
        //BubbleSort(arr);
        InsertionSort(arr);
        //SelectionSort(arr);

        //遍历输出排序后的数组元素
        for (int i = 0; i < arr.length; i++) {
            System.out.printf(arr[i] + " ");
        }
    }

    /**
     * 选择排序
     * 假定第一个数是最小的，遍历整个数组依次比较，将真正最小的数与第一个交换。
     * 每完成一轮就减少一个数的比较（fori中 i 加 1）
     * @param arr
     */
    private static void SelectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i], pos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (min > arr[j]){
                    min = arr[j];
                    pos = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[pos];
            arr[pos] = temp;
        }
    }

    /**
     * 插入排序
     * 抽出第二个数与前面的数比较，将它插入到合适的位置（while循环的条件）
     * @param arr
     */
    private static void InsertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;
            while (j >= 0 && temp < arr[j]){
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
    }

    /**
     * 冒泡排序
     * 参数为整个数组
     * fori循环   每一轮从第一个数和第二个数开始，比较两个数，将大的数向后移动，将最大的数移动到最后面
     *           每比较一轮就会确定一个最大的数，所以下一轮就减少比较一次
     * forj循环
     * boolean b    每轮比较之前用布尔型变量b来判断是否发生交换，默认没有发生交换（本身就是有序的），就直接跳出一次循环
     * @param arr
     */
    private static void BubbleSort(int[] arr) {
        for (int j = 0; j < arr.length - 1; j++) {
            boolean b = true;
            for (int i = 0; i < arr.length - 1 - j; i++) {
                if (arr[i] > arr[i + 1]){
                    b = false;
                    int temp = arr[i];          //用一个中间变量temp实现两个元素的交换
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
            if (b) break;
        }
    }


}
