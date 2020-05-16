import java.util.HashMap;
import java.util.Map;

public class Encoder {
    public static void main(String[] args) {
        String[] raw = {"a", "b", "a"};
        String[] code_words = {"1", "2", "3"};
        String[] result = encoder(raw, code_words);
        for (String s : result) {
            System.out.println(s);
        }
    }

    public static String[] encoder(String[] raw, String[] code_words) {

        Map<String, String> map = new HashMap<String, String>();

        String[] result = new String[raw.length];

        for (int i = 0; i < raw.length; i++) {
            if (!map.containsKey(raw[i])) {
                map.put(raw[i], code_words[i]);
                result[i] = code_words[i];
            } else {
                result[i] = map.get(raw[i]);
            }
        }

        return result;
    }
}
