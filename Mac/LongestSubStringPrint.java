import java.util.HashMap;
import java.util.Map;

public class LongestSubStringPrint {
    public static void main(String[] args) {
        System.out.println(subString("abwecadbdce"));
    }
    public static String subString(String s) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        int max = 0, start = 0, end = 1;
        int diff = 0;
        for(int i=0; i< s.length(); i++) {
            char current = s.charAt(i);

            if(map.containsKey(current)) {
                diff = Math.max(diff, map.get(current)); //exclude left side of map.get
            }
            map.put(current, i);
            if(max < i - diff) {
                max = i - diff;
                start = diff;
                end = i;
            }
        }
        return s.substring(start + 1, end + 1);
    }
}
