public class Knapsack {
    public static int knapsack(int[] profits, int[] weights, int maxWeightConstraint) {
        int[][] k = new int[profits.length + 1][maxWeightConstraint + 1];

        for (int i = 0; i <= profits.length; i++) {

            for (int w = 0; w <= maxWeightConstraint; w++) {

                if (i == 0 || w == 0) {
                    k[i][w] = 0;
                    continue;
                } 
                
                int currentWeight = weights[i - 1];
                if (currentWeight <= w) {
                    k[i][w] = Math.max(k[i - 1][w], profits[i - 1] + k[i - 1][w - currentWeight]);
                } else {
                    k[i][w] = k[i - 1][w];
                }
            }

        }

        int n = profits.length;
        int m = maxWeightConstraint;
        int cost = k[n][m];

        while (cost > 0) {
            if (cost != k[n - 1][m]) {
                // System.out.println(weights[n - 1]);
                m = m - weights[n - 1];
                cost = cost - profits[n - 1];
            }
            n--;
        }


        return k[profits.length][maxWeightConstraint];
    }

    public static void main(String[] args) {
        System.out.println(knapsack(new int[]{60, 50, 70, 30}, new int[]{5, 3, 4, 2}, 8)); //120
        System.out.println(knapsack(new int[]{60, 100, 120, 80, 30}, new int[]{10, 20, 30, 40, 50}, 400)); //390
        System.out.println(knapsack(new int[]{2, 4, 4, 5}, new int[]{4, 4, 6, 8}, 15)); // 10
    }
}
