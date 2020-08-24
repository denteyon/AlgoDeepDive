import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sumsToTarget(new int[]{2, 7, 11, 15}, 13)));
    }
    private static int[] sumsToTarget(int[] arr, int k) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            int siblingIndex = Arrays.binarySearch(arr, k - arr[i]);
            if (siblingIndex >= 0) { // Found it!
                /* If this points at us, then the pair exists only if
                 * there is another copy of the element. Look ahead of
                 * us and behind us.
                 */
                if (siblingIndex != i ||
                        (i > 0 && arr[i-1] == arr[i]) ||
                        (i < arr.length - 1 && arr[i+1] == arr[i])) {
                    return new int[]{i, siblingIndex};
                }
            }
        }
        return null;
    }
}
