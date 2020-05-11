package ctci;

public class BinaryToString {
    public static void main(String[] args) {
        System.out.println(convert(0.25));
    }
    public static String convert(double num) {
        StringBuilder sb = new StringBuilder();
        sb.append("0.");
        while (num > 0) {
            if (sb.length() >= 32) {
                return "ERROR";
            }
            num = num * 2;
            if (num >= 1) {
                sb.append("1");
                num = num - 1;
            } else {
                sb.append("0");
            }
        }
        return sb.toString();
    }
}
