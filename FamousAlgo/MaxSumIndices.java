import java.util.Arrays;

public class MaxSumIndices {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(cal(new int[]{-2, -4, -3, -5, -11, -9, -8})));
    }
    public static int[] cal(int[] arr) {
        int sum = 0;
        int max = 0;
        int start = 0;
        int end = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum < 0) {
                sum = 0;
                if (max == 0) {
                    start = i + 1;
                }
            }
            if (sum > max) {
                max = sum;
                end = i;
            }
        }
        return new int[]{start, end};
    }
}
