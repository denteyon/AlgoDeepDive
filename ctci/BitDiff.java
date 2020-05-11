package ctci;

public class BitDiff {
    public static void main(String[] args) {
        System.out.println(count(29, 15));
        // 110110
        // 100010
        // 010100
    }
    public static int count(int a, int b) {
        int count = 0;
        int mask = 1;
        while (a != 0 || b != 0) {
            if ((a & mask) != (b & mask)) {
                count++;
            }
            a >>= 1;
            b >>= 1;
        }
        return count;
    }
}
