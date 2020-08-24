public class HammingWeight {
    public static void main(String[] args) {
        System.out.println(hammingWeight(255));
    }
    public static int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n &= (n - 1);
        }
        return count;
        // 01 10 / 101 110
    }
}
