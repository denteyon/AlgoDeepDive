import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int arr[] = new int[]{6, 4, 7, 3, 8 ,8};
        quickSort(arr, 0, 5);
        System.out.println(Arrays.toString(arr));
    }
    public static void quickSort(int[] arr, int left, int right) {
        if (left < right) {
            int index = partition(arr, left, right);

            quickSort(arr, left , index - 1);

            quickSort(arr, index + 1, right);
        }

    }

    private static int partition(int[] arr, int left, int right) {
        int pivot = arr[right];

        int i = left - 1;

        for (int j = left; j < right; j++) {

            if (arr[j] < pivot) {

                i++;


                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }


        int temp = arr[i+1];
        arr[i+1] = arr[right];
        arr[right] = temp;

        return i+1;
    }
}
