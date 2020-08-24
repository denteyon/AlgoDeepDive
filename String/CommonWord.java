import java.util.*;

public class CommonWord {
    public static void main(String[] args) {
        String[] a = {"hit"};
        System.out.println(mostCommonWord("Bob hit a ball, the hit BALL flew far after it was hit.",a));
    }
    private static String mostCommonWord(String paragraph, String[] banned) {
        Set<String> bannedSet = new HashSet<>();
        Collections.addAll(bannedSet, banned);

        int count = 0;
        String ans="";

        Map<String, Integer> map = new HashMap<>();
        for (String s: paragraph.replaceAll("[^a-zA-Z ]", "").toLowerCase().split(" ")) {
            s = s.trim();
            if(s.length()==0 || bannedSet.contains(s)){
                continue;
            }
            map.put(s, map.getOrDefault(s, 0)+1);
            if(count<map.get(s)){
                count = map.get(s);
                ans = s;
            }
        }
        return ans;
    }
}
