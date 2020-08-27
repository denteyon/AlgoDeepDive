public class SqrtDouble {
    public static double sqrt(double num) {
        double decimalPlace = 0.000001;
        double guess = 1;
        double value = (num < guess)? 1 / num: num;

        while (value - guess > decimalPlace) {
            value = (value + guess) / 2;
            guess = num / value;
        }
        return Double.parseDouble(String.format("%.3f", value));
    }

    public static void main(String[] args) {
        System.out.println(sqrt(.0025));
    }
}