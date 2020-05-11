import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] a = {};
        mergeSort(a);
        System.out.println(Arrays.toString(a));
    }
    public static void mergeSort(int[] arr) {
        mergeSort(arr, 0, arr.length - 1);
    }
    public static void mergeSort(int[] arr, int leftStart, int rightEnd) {
        if (leftStart >= rightEnd) {
            return;
        }
        int middle = (leftStart + rightEnd) /2;
        mergeSort(arr, leftStart, middle);
        mergeSort(arr, middle + 1, rightEnd);
        merge(arr, leftStart, rightEnd);
    }
    public static void merge(int[] arr, int leftStart, int rightEnd) {
        int leftEnd = (leftStart + rightEnd) / 2;
        int righStart = leftEnd + 1;
        int size = rightEnd - leftStart + 1;

        int[] temp = new int[size];

        int left = leftStart;
        int right = righStart;
        int index = left;

        while (left <= leftEnd && right <= rightEnd) {
            if (arr[left] <= arr[right]) {
                temp[index] = arr[left];
                left++;
            } else {
                temp[index] = arr[right];
                right++;
            }
            index++;
        }

        System.arraycopy(arr, left, temp, index, leftEnd - left + 1);
        System.arraycopy(arr, right, temp, index, rightEnd - right + 1);
        System.arraycopy(temp, left, arr, left, size);
    }
}
