import java.util.Arrays;

public class ClimbLadder {
    public static void main(String[] args) {
        System.out.println(climb(3));
    }
    public static int climb(int n) {
        int memo[] = new int[n + 1];
        Arrays.fill(memo, -1);
        return helper(n, memo);
    }
    public static int helper(int n, int[] memo) {
        if (n == 0) {
            return 1;
        } else if (n < 0) {
            return 0;
        }
        if (memo[n] != -1) {
            return memo[n];
        }
        memo[n] = helper(n - 1, memo) + helper(n - 2, memo);
        return memo[n];
    }
}
