public class TwoSumCloset {
    public static void main(String[] args) {
        int[] a = {-1, 2, 1, -4};
        int[] res = closetBrute(a, 1);
        System.out.println(res[0]);
        System.out.println(res[1]);
    }
    private static int[] closetBrute(int[] arr, int k){
        int[] res = new int[2];
        int close = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                int sum = arr[i]+arr[j];
                if(Math.abs(sum - k) < close){
                    close = sum;
                    res[0] = i;
                    res[1] = j;
                }
            }
        }


        return res;
    }
}
