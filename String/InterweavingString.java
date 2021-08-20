import java.util.HashMap;
import java.util.Map;

public class InterweavingString {
    public static void main(String[] args) {
        System.out.println(interweavable("Coinbase", "intern", "Coininternbase"));
    }

    public static boolean interweavable(String first, String second, String result) {
        int firstIndex = 0;
        int firstLen = first.length();
        int secondIndex = 0;
        int secondLen = second.length();

        for (int i = 0; i < result.length(); i++) {
            char currentChar = result.charAt(i);

            if (firstIndex < firstLen - 1 && currentChar == first.charAt(firstIndex)) {
                firstIndex++;
            } else if (secondIndex < secondLen - 1 && currentChar == second.charAt(secondIndex)) {
                secondIndex++;
            } else {
                return false;
            }
        }

        return (firstIndex == firstLen - 1 && secondIndex == secondLen - 1);


    }
}
