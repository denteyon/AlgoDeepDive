import java.util.HashMap;
import java.util.Map;

public class PaliodromeParmutaion {
    public static void main(String[] args) {
        System.out.println(paliCheck("civic"));
        System.out.println(paliCheck("abea"));
    }
    public static boolean paliCheck(String str) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (map.containsKey(c)) {
                map.remove(c);
            } else {
                map.put(c, 0);
            }
        }
        return map.size() <= 1;
    }
}
