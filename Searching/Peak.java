public class Peak {
    public static void main(String[] args) {
        System.out.println(findPeakElement(new int[]{1,2,3,1}));
    }
    public static int findPeakElement(int[] nums) {
        int peak = nums[0];
        int mightPeak = 0;
        int max = 0;
        for (int i = 1; i < nums.length; i++) {

            if (peak < nums[i]) {
                mightPeak = 1;
                max = i;
            } else if (peak > nums[i] && mightPeak == 1) {
                return i - 1;
            } else {
                mightPeak = 0;
            }
            peak = nums[i];
        }
        return max;
    }
}
