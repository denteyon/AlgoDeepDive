import java.util.HashMap;
import java.util.Map;

public class GameOfThrone {
    public static void main(String[] args) {
        System.out.println(gameOfThrones("cdcdcdcdeeeef"));
        System.out.println(gameOfThrones("cdefghmnopqrstuvw"));
        System.out.println(gameOfThrones("aaabbbb"));//bbaaabb
    }
    static String gameOfThrones(String s) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i =0;i<s.length();i++){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), i);
            } else {
                map.remove(s.charAt(i));
            }
        }
        if(map.size()>1){
            return "NO";
        } else {
            return "YES";
        }
    }
}
