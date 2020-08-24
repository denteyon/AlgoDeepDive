public class Loops {
    public static void main(String[] args) {
        System.out.println(loops());
    }
    public static int loops() {
        int res = 1;
        for (int i = 10; i <= 10; i++) {
            int firstSum = 0;
            for (int j = i; j <= 10; j++) {
                int secondSum = 0;
                for (int k = j; k <= j+1; k++) {
                    int thirdSum = 0;
                    for (int l = k; l <= k+2; l++) {
                        thirdSum += Math.pow(-1, l);
                    }
                    secondSum += thirdSum;
                }
                firstSum += secondSum;
            }
            res *= firstSum;
        }
        return res;
    }
}
