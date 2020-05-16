import java.util.Arrays;

public class Decode {
    public static void main(String[] args) {
        System.out.println(decode("120543"));
        System.out.println(decode("12345"));
        System.out.println(decode("1"));
    }

    public static int decode(String s) {
        int[] memo = new int[s.length()];
        Arrays.fill(memo, -1);
        return helper(s, s.length(), memo);
    }
    public static int helper(String s, int k, int[] memo) {
        if (k == 0) {
            return 1;
        }
        int i = s.length() - k;
        if (s.charAt(i) == '0') {
            return 0;
        }
        if (memo[k - 1] != -1) {
            return memo[k - 1];
        }
        int result = 0;
        result = helper(s, k - 1, memo);
        if (k >= 2 && Integer.parseInt(s.substring(i, i + 2)) <= 26) {
            result += helper(s, k -2, memo);
        }
        memo[k - 1] = result;
        return result;
    }
}
