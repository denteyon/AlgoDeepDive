package InterviewCake;

public class ReverseStringInPlace {
    public static void main(String[] args) {
        System.out.println(reverse("talkative"));
    }
    public static String reverse(String str) {
        char[] s = str.toCharArray();
        int n = str.length();
        for (int i = 0; i < n/2; i++) {
            char temp = s[i];
            s[i] = s[n - 1 - i];
            s[n - 1 - i] = temp;
        }
        return new String(s);
    }
}
