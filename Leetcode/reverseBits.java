public class reverseBits {
    // you need treat n as an unsigned value
    public static void main(String[] args) {
        System.out.println(reverseBits(1234567));
    }
    public static int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            result = result << 1;
            result |= (n & 1);
            n = n >> 1;
        }
        return result;
    }
}
