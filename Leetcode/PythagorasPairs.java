import java.util.Arrays;

public class PythagorasPairs {
    public static void main(String[] args) {
        lookup(new int[]{5, 4, 3, 20, 8, 25, 17, 16, 15, 12});
    }
    public static void lookup(int[] a) {
        Arrays.sort(a);

        for (int i = 0; i < a.length - 1; i++) {
            int first = a[i];
            int j = i + 1, second = a[j];
            int k = a.length - 1, third = a[k];
            while (j != k) {
                if (first*first + second*second < third*third) {
                    k--;
                    third = a[k];
                } else if (first*first + second*second > third*third) {
                    j++;
                    second = a[j];
                } else {
                    System.out.print(first + ", ");
                    System.out.print(second + ", ");
                    System.out.print(third);
                    break; //elements are unique
                }
            }
        }
    }
}
