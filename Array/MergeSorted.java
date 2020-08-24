public class MergeSorted {
    public static void main(String[] args) {
        merge(new int[]{1, 2, 3, 0, 0, 0}, 3 , new int[]{2, 5, 6}, 3);
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if (m + n != nums1.length) {
            throw new IllegalArgumentException();
        }
        for (int i = m + n - 1; i >= 0; i--) {
            if (n == 0) {
                nums1[i] = nums1[m - 1];
                if (m > 0) {
                    m--;
                }
            } else if (m ==0) {
                nums1[i] = nums2[n - 1];
                if (n > 0) {
                    n--;
                }
            } else if (nums1[m - 1] > nums2[n - 1]) {
                nums1[i] = nums1[m - 1];
                if (m > 0){
                    m--;
                }
            } else {
                nums1[i] = nums2[n - 1];
                if (n > 0){
                    n--;
                }
            }
        }
    }
}