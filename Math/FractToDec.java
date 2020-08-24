import java.util.HashMap;

public class FractToDec {
    public static void main(String[] args) {
        System.out.println(fractionToDecimal(1, 3));
    }
    public static String fractionToDecimal(int A, int B) {
        if (A == 0) {
            return String.valueOf(0);
        }

        StringBuilder dec = new StringBuilder();

        // pos or neg
        dec.append((A > 0) ^ (B > 0) ? "-" : "" );
        long num = Math.abs((long)A);
        long den = Math.abs((long)B);

        // integral part
        dec.append(num / den);
        num %= den;
        if (num == 0) {
            return dec.toString();
        }

        // fractional part
        dec.append(".");

        // keep track of recurring decimals with hash map
        HashMap<Long, Integer> map = new HashMap<Long, Integer>();
        map.put(num, dec.length());

        while (num != 0) {
            num *= 10;
            dec.append(num / den);
            num %= den;

            if (map.containsKey(num)) {
                // repeat digit
                dec.insert(map.get(num), "(");
                dec.append(")");
                break;
            }
            else {
                map.put(num, dec.length());
            }
        }

        return dec.toString();
    }
}