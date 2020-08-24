public class BinarySearch {
    public static void main(String[] args) {
        int[] array = { 10, 13, 19, 20, 24, 26, 30, 34 };

//        int from = 0, to = array.length - 1;

        System.out.println(binarySearch(array, 10)); // 0
        System.out.println(binarySearch(array, 19)); // 2
        System.out.println(binarySearch(array, 26)); // 5
        System.out.println(binarySearch(array, 34)); // 7
        System.out.println(binarySearch(array, 35)); // 8
        System.out.println(binarySearch(array, 5));   // -1
        System.out.println(binarySearch(array, 16)); // -1
        System.out.println(binarySearch(array, 40)); // -1
    }

    public static int binarySearch(int[] array, int elem) {

        int left = 0;
        int right = array.length -1;
        while (left <= right) {
            int mid = left + (right - left) / 2; // the index of the middle element

            if (elem == array[mid]) {
                return mid; // the element is found, return its index
            } else if (elem < array[mid]) {
                right = mid - 1; // go to the left subarray
            } else {
                left = mid + 1;  // go the the right subarray
            }
        }
        return -1; // the element is not found
    }
}
