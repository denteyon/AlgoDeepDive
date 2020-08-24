package ctci;

public class StringCompression {
    public static String compress(String s) {
        if (s.length() == 0) {
            return s;
        }
        StringBuilder sb = new StringBuilder();
        char temp = '\0';
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (temp != c) {
                if (count != 0) {
                    sb.append(temp);
                    sb.append(count);
                }
                temp = c;
                count = 1;
            } else {
                count++;
            }
        }
        sb.append(temp);
        sb.append(count);
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(compress("aaabccddd"));
    }
}
