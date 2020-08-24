public class SingleNum2 {
    public static int singleNumber(int[] nums) {
        int ans = 0;
        for(int i = 0; i < 32; i++) {
            int sum = 0;
            for (int num : nums) {
                if (((num >> i) & 1) == 1) {
                    sum++;
                    sum %= 3;
                }

            }
            if(sum != 0) {
                ans |= sum << i;
            }
            System.out.println(ans);
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{1, 2, 2, 2, 1, 1, 3}));
    }
}
