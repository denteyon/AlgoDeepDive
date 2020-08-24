import java.util.Random;

public class RandomMaxIndex {
    public static void maxRandomIndex(int[] nums) {
        Random random = new Random();

        int max = Integer.MIN_VALUE;
        int maxIndex = -1;

        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                maxIndex = i;
                count = 1;
            } else if (nums[i] == max) {
                count++;

                // probability of 1/count
                if (random.nextInt(count) == 0) {
                    maxIndex = i;
                }
            }

            System.out.print(maxIndex + " ");
        }
    }

    public static void main(String[] args) {
//        maxRandomIndex(new int[]{1, 30, 2, 30, 30, 30});
        maxRandomIndex(new int[]{1, 2, 30, 4, 30, 30, 30, 5, 7, 62, 8, 62});
    }
}
