public class BoyerMoore {
    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{1, 200, 3, 200, 200 , 200, 5, 200 , 1}));
    }
    public static int majorityElement(int[] nums) {
        int count = 0;
        Integer candidate = null;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }

}
