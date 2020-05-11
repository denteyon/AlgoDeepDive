import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        System.out.print("Enter a positive number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        printPrimes(number);
    }

    private static void printPrimes(int n) {
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
