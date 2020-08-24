import java.util.Arrays;

public class NextPermutation {
    /*
  Next Permutation - LeetCode: https://leetcode.com/problems/next-permutation
  All credit for code goes to the Leetcode solution writer:
  https://leetcode.com/problems/next-permutation/solution/
  This code passes all Leetcode test cases as of Jan. 13 2019
  Runtime: 15 ms, faster than 77.82% of Java online submissions for Next Permutation.
  Note: This code will make no sense at all if you do not see the intuition behind
  why we do what we do (explained in the video). We will just be memorizing random
  information without this reasoning.

  The video to explain this code is here: https://www.youtube.com/watch?v=quAS1iydq7U
*/
    public static void main(String[] args) {
        System.out.println(Arrays.toString(nextPermutation(new int[]{1, 3, 4, 2})));
        System.out.println(Arrays.toString(prevPermutation(new int[]{1, 4, 2, 3})));
    }
    public static int[] prevPermutation(int[] str)
    {

        // Find index of the last
        // element of the string
        int n = str.length - 2;

        // Find largest index i such
        // that str[i ? 1] > str[i]
        int i = n;
        while (i >= 0 && str[i] <= str[i + 1])
        {
            i--;
        }

        // if string is sorted in
        // ascending order we're
        // at the last permutation
        if (i <= 0)
        {
            return null;
        }

        // Note - str[i..n] is sorted
        // in ascending order Find
        // rightmost element's index
        // that is less than str[i - 1]
        int j = i;
        while (j<= n && str[j] <= str[i])
        {
            j++;
        }

        // Swap character at i-1 with j
        swap(str, i, j);

        // Reverse the substring [i..n]
//        StringBuilder sb = new StringBuilder(String.valueOf(str));
//        sb.reverse();
//        str = sb.toString().toCharArray();
        reverse(str, i + 1);

        return str;
    }

    public static int[] nextPermutation(int[] nums) {

  /*
    Grab the index of the 2nd to last element in the array
  */
        int i = nums.length - 2;

  /*
    Walk backwards. Keep walking until we reach the point right
    before the decreasing sequence begins. When this while loop
    ends that is where i will stand
  */
        while (i >= 0 && nums[i + 1] <= nums[i]) {
            i--;
        }

  /*
    If i is not the first element we have more work to do

    If i IS the first element we just skip down to reverse
    the whole array since the WHOLE array would be decreasing
    meaning we are on our last permutation
  */
        if (i >= 0) {

    /*
      Start a pointer at the end of the array, we want to search for
      the smallest item THAT IS GREATER THAN THE ELEMENT AT i
      Why? Why Why Why. The reason why is that we want to know the
      NEXT element that is to be planted where i is sitting. THIS
      WILL ROOT THE NEXT PERMUTATION and represents the smallest change
      we can make thus ensuring we have exactly the next permutation
    */
            int j = nums.length - 1;
            while (j >= 0 && nums[j] <= nums[i]) {
                j--;
            }

    /*
      We swap those elements.

      Now all that is left is to reverse the decreasing section (it
      is already sorted in reverse order) to restore it to the first
      positionality it would be with the new value rooted at i
    */
            swap(nums, i, j);
        }

  /*
    Perform the reversal on the decreasing section now. We pass in i + 1
    since i sits RIGHT BEFORE the decreasing section that is on its final
    permutation
  */
        reverse(nums, i + 1);

        return nums;

    }

    /*
      Reverses from 'start' to the end of the array 'nums'
    */
    private static void reverse(int[] nums, int start) {

        int left = start;
        int right = nums.length - 1;

        while (left < right) {
            swap(nums, left, right);
            left++;
            right--;
        }

    }

    /*
      Swap helper
    */
    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
