public class Lcd {
    static int lcd(int a, int b){
        if(a < b){
            int temp = b;
            b = a;
            a = temp;
        }

        return (a*b)/gcd(a, b);
    }
    static int gcd(int a, int b){
        if(b == 0){
            return a;
        } else {
            return gcd(b, a%b);
        }
    }

    public static void main(String[] args) {
        System.out.println(lcd(10, 15));
    }
}
