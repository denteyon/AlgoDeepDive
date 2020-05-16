public class OctaToDeci {
    public static void main(String[] args) {
        //12
        System.out.println(octToDeci(12));
        System.out.println(octToDeci("12"));
    }
    private static int octToDeci(int octa){
        int temp = 0;
        int decimal = 0;
        int n = 0;
        while(octa>0){
            temp = octa%10;
            decimal += temp*Math.pow(8, n);
            octa = octa/10;
            n++;
        }
        return decimal;
    }
    private static int octToDeci(String octa){
        int decimal = 0;
        int n = octa.length()-1;
        for (int i = 0; i < octa.length(); i++) {
            int temp = Character.getNumericValue(octa.charAt(i));
            decimal += temp * Math.pow(8, n);
            n--;
        }
        return decimal;
    }
}
