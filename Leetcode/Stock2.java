public class Stock2 {
    public static void main(String[] args) {
        System.out.println(calStock(new int[]{7,1,5,3,6,4}));
    }
    public static int calStock(int[] arr) {
        int maxProfit = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] > 0) {
                maxProfit += arr[i] - arr[i - 1];
            }
        }
        return maxProfit;
    }
}
