import java.util.LinkedList;
import java.util.Queue;

public class InfiniteBinaryNumber {
    public static void printBinary(int n) {
        if (n == 0) {
            System.out.println("0");
            return;
        }
        Queue<String> queue = new LinkedList<>();
        queue.add("0");
        queue.add("1");
        while (n-- > 0) {
            String s = queue.poll();
            System.out.println(s);
            queue.add(s + "0");
            queue.add(s + "1");
        }
    }

    public static void printBinary2(int n) {
        if (n == 0) {
            System.out.println("0");
            return;
        }
        int span = 2;
        int digit = 1;

        for (int i = 0; n > 0; i++) {
            if (span == i) {
                i = 0;
                span *= 2;
                digit++;
            }

            String s = Integer.toBinaryString(i);

            while (s.length() < digit) {
                s = "0" + s;
            }
            System.out.println(s);
            n--;
        }
    }

    public static void main(String[] args) {
        printBinary2(20);
    }
}