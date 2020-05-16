public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
        System.out.println(Integer.MAX_VALUE);
    }
    private static int reverse(int x){
        int num = Math.abs(x);
        int result = 0;
        while(num>0){
            int last = num%10;
            int previous = result;
            result = (result*10) + last;
            if((result-last)/10 != previous){
                return 0;
            }
            num = num/10;
        }
        return result*Integer.signum(x);
    }
}
