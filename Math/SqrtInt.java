public class SqrtInt {
    public static int sqrt(int num) {
        long guess = 1;
        long value = num;

        while (value * value > num) {
            value = (value + guess) / 2;
            guess = num / value;
        }
        return (int)value;
    }

    public static void main(String[] args) {
        System.out.println(sqrt(100));
    }
}