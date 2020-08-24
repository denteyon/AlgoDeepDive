import java.util.Arrays;

public class SalaryCap {
    public static int computeSalaryCap(int[] salaries, int budget) {

        int len = salaries.length;
        if (len == 0) {
            return budget;
        }

        int bucket = budget / len;
        int extra = 0;
        Arrays.sort(salaries);

        for (int i = 0; i < len; i++) {
            if (salaries[i] <= bucket) {
                extra += bucket - salaries[i];
            } else {
                return bucket + extra / (len - i);
            }
        }
        return bucket;
    }

    public static void main(String[] args) {
        System.out.println(computeSalaryCap(new int[]{300, 100, 200, 400}, 800)); //250
    }
}
