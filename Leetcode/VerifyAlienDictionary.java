public class VerifyAlienDictionary {
    public static void main(String[] args) {
        System.out.println(verify(new String[]{"hello","leetcode"}, "hlabcdefgijkmnopqrstuvwxyz"));
    }
    public static boolean verify(String[] words, String order) {
        int[] table = new int[26];

        for (int i = 0; i < order.length(); i++) {
            table[order.charAt(i) - 'a'] = i;
        }

        for (int i = 0; i < words.length - 1; i++) {
            if (isBigger(words[i], words[i + 1], table)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isBigger(String s1, String s2, int[] table) {
        int len = Math.min(s1.length(), s2.length());

        for (int i = 0; i < len; i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);

            if (c1 != c2) {
                return table[c1 - 'a'] > table[c2 - 'a'];
            }
        }
        return s1.length() > s2.length();
    }
}
