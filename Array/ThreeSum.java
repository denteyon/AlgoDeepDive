//import java.util.HashMap;
//import java.util.Map;
//
//public class ThreeSum {
//    public static void main(String[] args) {
//
//    }
//    private static boolean threeSum(int[] arr, int k){
//        Map<Integer, Integer> map = new HashMap<>();
//        int completement;
//        for (int i = 0; i < arr.length; i++) {
//            completement = k - arr[i];
//            map.put(completement, i);
//        }
//
//    }
//    private static boolean twoSum(int[] arr, int k){
//        Map<Integer, Integer> map = new HashMap<>();
//        int complment;
//
//        for (int i = 0; i < arr.length; i++) {
//            complment = k - arr[i];
//            if(map.containsKey(complment)){
//                return new int[]{i, map.get(complment)};
//            } else {
//                map.put(arr[i], i);
//            }
//        }
//        return new int[]{};
//    }
//}
