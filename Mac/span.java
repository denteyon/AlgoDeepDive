public class span {
    public static void main(String[] args) {
        int[] a = {1};
        System.out.println(maxSpan(a));
    }

    public static int maxSpan(int[] nums) {
        //find span
        //find max
        int span = 0;
        int max = 0;

        for(int i=0;i<nums.length;i++){
            for(int j=nums.length-1; j>=0; j--){
                if(nums[i]==nums[j]){
                    span = j-i+1;
                    break;
                }
            }
            if(span>max){
                max = span;
            }
        }

        return max;


    }

}
