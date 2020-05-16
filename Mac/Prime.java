public class Prime {
    public static void main(String[] args) {
        prime(2020);
    }

    private static void prime(int n) {
        int f = 2;
        while (n > 1) {
            if (n % f == 0) {
                System.out.println(f);
                n /= f;
            } else {
                f++;
            }
        }
    }

}
