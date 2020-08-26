import java.util.ArrayList;
import java.util.List;

public class KthPermutation {
        public static int factorial(int n) {
            if (n == 0 || n == 1) {
                return 1;
            }
            return n * factorial(n - 1);
        }

        public static void find_kth_permutation(List<Character> list, int k, StringBuilder result) {

            if (list.isEmpty()) {
                return;
            }

            int n = list.size();
            // count is number of permutations starting with first digit
            int count = factorial(n - 1);
            int selected = (k - 1) / count;

            result.append(list.get(selected));
            list.remove(selected);

            k = k - (count * selected);
            find_kth_permutation(list, k, result);
        }
        public static String get_permutation(int n, int k) {
            List<Character> list = new ArrayList<Character>();
            char c = '1';
            for (int i = 1; i <= n; i++) {
                list.add(c);
                c++;
            }

            StringBuilder sb = new StringBuilder();
            find_kth_permutation(list, k, sb);
            return sb.toString();
        }
        public static void main(String[] args) {
        //    for (int i = 1; i <= factorial(4); ++i) {
        //        System.out.println( i + "th permutation = \t" + get_permutation(4, i));
        //    }
            System.out.println(get_permutation(4, 7));
        }

}
