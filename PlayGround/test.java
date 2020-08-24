import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Hello();
    }
    private static void Hello(){
//        String s1 = "ABC";
//        String s2 = "ABC";
//        String s3 = new String("ABC");
//        System.out.println(s1 == s2);
//        System.out.println(s1 == s3);
//        String a="hello", b="hello", c=new String("hello"), d=c, e=new String("hello");
//        System.out.println(c.equals(e));
//        int aa = 1101;
//        int bb = 1001;
//        int x = aa ^ bb;
//        aa = x ^ aa;
//        bb = x ^ bb;
//        System.out.println(aa);
//        System.out.println(bb);
        System.out.print("Enter a positive number: ");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
//        int count = 0;
//        for (int i = 0; i < n; i++) {
//            for (int j = i; j < n; j++) {
//                count+=j;
//            }
//        }
//        System.out.println(count);
//        System.out.println(n*(n+1)*(2*n+1)/6);
        String[] digits = s.split(":");
        int i = Integer.parseInt(digits[1], 16);
        System.out.println(i);
//        System.out.println(Arrays.toString(digits));
    }
}
