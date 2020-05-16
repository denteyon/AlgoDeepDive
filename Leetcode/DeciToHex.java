public class DeciToHex {
    public static void main(String[] args) {
        System.out.println(convert(15));
    }

    private static String convert(int num){
        String hex = "";
        char hexchars[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        while(num > 0)
        {
            int a = num % 16;

            hex = hexchars[a]+hex;
            num = num / 16;
        }
        return hex;
    }
}
