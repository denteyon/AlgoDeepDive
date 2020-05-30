public class Stock1 {
    public static void main(String[] args) {
        System.out.println(calStock(new int[]{7,1,5,3,6,4}));
    }
    public static int calStock(int[] arr) {
        int minStock = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minStock) {
                minStock = arr[i];
            }
            if (maxProfit < arr[i] - minStock) {
                maxProfit = arr[i] - minStock;
            }
        }
        return maxProfit;
    }
}
