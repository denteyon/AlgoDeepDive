public class Gcd {
    public static void main(String[] args) {
        System.out.println(gcd(25, 15));
    }
    private static int gcd(int a , int b){
        //a must be greater than or equal to b
        if(b > a){
            int temp = a;
            a = b;
            b = temp;
        }
        if(b == 0){
            return a;
        } else {
            return gcd(b, a%b);
        }
    }
}
