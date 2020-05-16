public class DeciToBi {
    public static void main(String[] args) {
        System.out.println(convert(8));
    }

    private static String convert(int n){
        String binary = "";
        while(n > 0)
        {
            int a = n % 2;

            binary = a+binary;
            n = n / 2;
        }
        return binary;

    }
}
