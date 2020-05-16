import java.util.HashMap;
import java.util.Map;

//first missing positive
public class missingPositive {
    public static void main(String[] args) {
        int[] a = {0, 2, 1}; //3
        int[] b = {1, 2, 0}; //3
        int[] c = {8, 7, 9, 10}; //1
        int[] d = {1, -1, 0}; //2
        int[] edge = {1, -1, 0, 2, 0};

        System.out.println(firstMissingPositive(a)); //return 3
        System.out.println(firstMissingPositive(b)); //3
        System.out.println(firstMissingPositive(c)); //1
        System.out.println(firstMissingPositive(d)); //2
        System.out.println(firstMissingPositive(edge));

    }
    public static int firstMissingPositive(int[] nums) {
        int missing = 1;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i= 0; i<nums.length;i++){
            if(nums[i]>0){
                map.put(nums[i], i);
            }
        }
        while(map.containsKey(missing)){
            missing++;
        }
        return missing;
    }
}
