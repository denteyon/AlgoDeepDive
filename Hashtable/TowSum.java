import java.util.HashMap;
import java.util.Map;

public class TowSum {
    public static void main(String[] args) {
        int[] a = twoSum(new int[]{1, 2, 5, 6}, 5);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
    private static int[] twoSum(int[] arr, int k){
        Map<Integer, Integer> map = new HashMap<>();
        int complment;

        for (int i = 0; i < arr.length; i++) {
            complment = k - arr[i];
            if(map.containsKey(complment)){
                return new int[]{i, map.get(complment)};
            } else {
                map.put(arr[i], i);
            }
        }
        return new int[]{};
    }
}
