public class KadaneProduct {
    public static int maxProduct(int[] nums) {
        int product = 1;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++) {
            product = product * nums[i];
            if (max < product) {
                max = product;
            }
            if (product < 1) {
                product = 1;
            }

        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(maxProduct(new int[]{-2, -3, -3}));
    }
}
