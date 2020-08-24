public class FlipBit {
    public static void main(String[] args) {
        System.out.println(findMaxLength(0b110110));
    }
    public static int findMaxLength(int bit) {
        int previousLength = -1;
        int currentLength = 0;
        int maxLength = 0;
        int mask = 1;

        while (bit != 0) {
            if ((mask & bit) == 1) {
                currentLength++;
            } else {
                previousLength = currentLength;
                currentLength = 0;
            }
            maxLength = Math.max(previousLength + currentLength + 1, maxLength);
            bit = bit >> 1;
        }

        return maxLength;
    }
}
