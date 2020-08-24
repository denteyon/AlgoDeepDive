import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Factorize {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(factorize(28).toArray()));
    }
    public static List<Integer> factorize(int n) {
        List<Integer> list = new ArrayList<>();
        int num = 2;
        int curr = 0;

        while (n >= num) {
            while (n % num == 0) {
                System.out.println(n);
                if (num != curr) {
                    curr = num;
                    list.add(curr);
                }
                n = n / num;
            }
            num++;
        }

        return list;
    }
}