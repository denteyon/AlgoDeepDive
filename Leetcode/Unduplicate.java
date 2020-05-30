import java.util.LinkedHashSet;
import java.util.Set;

public class Unduplicate {
    public static void main(String[] args) {
        System.out.println(unduplicate("abacb"));
    }
    public static String unduplicate(String input) {
        Character head = null;
        Set<Character> set = new LinkedHashSet<>();
        for (int i = input.length() - 1; i >= 0; --i) {
            Character c = input.charAt(i);
            if (set.add(c))
                head = c;
            else if (c.compareTo(head) < 0) {
                set.remove(c);
                set.add(head = c);
            }
        }
        StringBuilder result = new StringBuilder(set.size());
        for (Character c: set)
            result.append(c);
        return result.reverse().toString();
    }
}
