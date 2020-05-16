public class a {
    public static void main(String[] args) {
        int[] a = {1, 1, 1, 1, 4};
//         int[] a = {14, 14};
//        int[] a = {2, 1, 1, 2, 1};
        System.out.println(canBalance(a));
    }
    public static boolean canBalance(int[] nums) {
        int i = 0;
        int j = nums.length-1;

        if(j<=0){
            return false;
        }
        System.out.println("start"+" "+i+" "+j);
        int numI = nums[i];
        ++i;
        int numJ = nums[j];
        --j;



        while(i<=j){
            System.out.println(numI+"and"+numJ);
            System.out.println(i+" i and"+numJ+" j");
            if(numI<numJ){
                System.out.println("i "+i);
                numI += nums[i];
                i++;

            } else if(numI> numJ){
                System.out.println("j "+j);
                numJ += nums[j];
                j--;

            } else {
                if(i==j){
                    return false;
                }
                System.out.println("Both"+" "+i+" "+j);
                numI += nums[i];
                i++;
                numJ += nums[j];
                j--;

            }
        }
        System.out.println(numI);
        System.out.println(numJ);
        System.out.println("final"+" "+i+" "+j);
        if(numI==numJ){
            return true;
        } else {
            return false;
        }
    }
}
