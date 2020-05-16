public class reverseString {
    public static void main(String[] args) {
        System.out.println(reverseWords(" Hello World"));
    }
    public static String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int index = words.length - 1; index >= 0; index -= 1) {
            if (!words[index].equals("")) {
                sb.append(words[index]);
                sb.append(' ');
            }
        }
//        if (sb.length() > 0 && sb.charAt(sb.length() - 1) == ' ') {
//            sb.deleteCharAt(sb.length() - 1);
//        }
        return sb.toString().trim();
    }
}
