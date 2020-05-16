import java.util.HashMap;
import java.util.Map;

public class RomanToDecimal {
    public static void main(String[] args) {
        String str = "MCMIV";
        System.out.println(romanToDecimal(str));
    }
    private static int romanToDecimal(String str){
        Map<String, Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("IV", 4);
        map.put("V", 5);
        map.put("IX", 9);
        map.put("X", 10);
        map.put("XL", 40);
        map.put("L", 50);
        map.put("XC", 90);
        map.put("C", 100);
        map.put("CD", 400);
        map.put("D", 500);
        map.put("CM", 900);
        map.put("M", 1000);

        int result = 0;

        for (int i = 0; i < str.length(); i++) {
            String s = str.substring(i, i+2);

            if(map.containsKey(s)){
                result += map.get(s);
                i++;
            } else {
                s = str.substring(i, i+1);
                if(map.containsKey(s)){
                    result += map.get(s);
                } else {
                    throw new IllegalArgumentException("Invalid Argument");
                }
            }
        }

        return result;

    }
}
