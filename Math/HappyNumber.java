public class HappyNumber {
    public static void main(String[] args) {
        System.out.println(isHappy(8));
    }
    private static boolean isHappy (int n) {
        System.out.println(cal(n));
        int x = cal(n);
        int y =cal(cal(n));
        if(x == 1 || y == 1) {
            return true;
        }
        if(x == y) {
            return false;
        } else {
            return isHappy(x);
        }
    }
    private static int cal(int n) {
        int rem;
        int total = 0;
        while(n != 0) {
            rem = n%10;
            n = n/10;
            total += rem * rem;
        }
        return total;
    }
}
