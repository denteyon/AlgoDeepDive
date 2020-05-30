import java.util.HashSet;
import java.util.Set;

public class ValidPaliodrome {
    public static void main(String[] args) {
        System.out.println(validPalindrome("atbbga"));
    }
    public static boolean validPalindrome(String s) {
        Set<Character> set = new HashSet<Character>();

        int n = s.length();

        for(int i=0; i<n; i++) {
            char current = s.charAt(i);
            if(!set.contains(current)) {
                set.add(current);
            } else {
                set.remove(current);
            }
        }

        if(set.size()==2) {
            return validPalindrome(s.replace(set.iterator().next().toString(), ""));
        } else {
            return set.size() <=1;
        }
    }
}
