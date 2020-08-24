import java.util.Arrays;

public class DutchNationalFlag {
    public static void main(String[] args) {
        int[] a = {1, -1, 0, 3, 0, 2, 1};
        System.out.println(Arrays.toString(partition(a, 1)));
    }
    public static int[] partition(int[] arr, int pivot) {
        int i = 0;
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            if (arr[start] < pivot) {
                swap(arr, i, start);
                i++;
                start++;
            } else if (arr[start] > pivot) {
                swap(arr, start, end);
                end--;
            } else {
                start++;
            }
        }
        return arr;
    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
