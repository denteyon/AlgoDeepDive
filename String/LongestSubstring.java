import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {
    public static void main(String[] args) {
        System.out.println(subString("geeksforgeeks"));
    }
        public static int subString(String s) {
            Map<Character, Integer> map = new HashMap<Character, Integer>();
            int max = 0;
            int diff = 0;
            for(int i=0; i< s.length(); i++) {
                char current = s.charAt(i);

                if(map.containsKey(current)) {
                    diff = Math.max(diff, map.get(current));
                }
                map.put(current, i);
                max = Math.max(max, i - diff);
            }
            return max + 1;
        }

}
