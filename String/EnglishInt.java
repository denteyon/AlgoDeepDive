public class EnglishInt {
    public static void main(String[] args) {
        System.out.println(convert(19323984));
        System.out.println(convert(123));
        System.out.println(convert(12340));
        System.out.println(convert(1234567));
    }
    static String[] tenths = {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
    static String[] overtens = {"", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    static String[] digits = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
    public static String numberToWords(int num) {
        if (num == 0) {
            return "Zero";
        }
        return convert(num);
    }
    public static String convert(int n) {
        if (n >= 1000000000) {
            int ans = n / 1000000000;
            int rem = n % 1000000000;
            if (rem == 0) {
                return convert(ans) + " Billion";
            }
            return convert(ans) + " Billion " + convert(rem);
        } else if (n >= 1000000) {
            int ans = n / 1000000;
            int rem = n % 1000000;
            if (rem == 0) {
                return convert(ans) + " Million";
            }
            return convert(ans) + " Million " + convert(rem);
        } else if (n >= 1000) {
            int ans = n / 1000;
            int rem = n % 1000;
            if (rem == 0) {
                return convert(ans) + " Thousand";
            }
            return convert(ans) + " Thousand " + convert(rem);
        } else if (n >= 100) {
            int ans = n / 100;
            int rem = n % 100;
            if (rem == 0) {
                return convert(ans) + " Hundred";
            }
            return convert(ans) + " Hundred " + convert(rem);
        } else if (n > 9 && (n % 10) == 0) {
            return tenths[n / 10];
        } else if (n > 10 && n < 20) {
            return overtens[n % 10];
        } else if (n > 10) {
            int ans = n / 10;
            int rem = n % 10;
            return tenths[ans] + " " + convert(rem);
        } else if (n < 10) {
            if (n == 0) {
                return "";
            }
            return digits[n];
        }
        return null;
    }
}
