import java.util.Arrays;

public class WiggleSort {
    public static void main(String[] args) {
        int[] a = {1, 5, 4, 1, 1, 6};
        wiggleSort(a);
    }
    public static void wiggleSort(int[] nums) {
        int[] newArr = nums;
        Arrays.sort(newArr);
        int start = 0;
        int end = nums.length - 1;
        for(int i=0; i<nums.length; i++){
            if(i%2==0){
                System.out.println(newArr[start]);
                nums[i] = newArr[start++];
            } else {
                // nums[i] = newArr[end--];
                System.out.println(newArr[end]);
                nums[i] = newArr[end--];
            }
        }
    }
}
