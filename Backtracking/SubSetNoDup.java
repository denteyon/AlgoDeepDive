import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSetNoDup {
    public static void main(String[] args) {
        System.out.println(subsetsWithDup(new int[]{1, 2, 3}));
    }
    public static List<List<Integer>> subsetWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        helper(res,new ArrayList<>(),nums,0);
        return res;
    }

    public static List<List<Integer>> subsetsWithDup(int[] num) {
        Arrays.sort(num);
        List<List<Integer>> ret = new ArrayList<>();
        ret.add(new ArrayList<Integer>());
        int count = 0;

        int size = 0, startIndex;
        for(int i = 0; i < num.length; i++) {
            startIndex = (i >= 1 && num[i] == num[i - 1]) ? size : 0;
            size = ret.size();
            for(int j = startIndex; j < size; j++) {
                List<Integer> temp = new ArrayList<>(ret.get(j));
                temp.add(num[i]);
                ret.add(temp);
                count++;
            }
        }
        System.out.println(count);
        return ret;
    }

    public static void helper(List<List<Integer>> res, List<Integer> ls, int[] nums, int pos) {
        res.add(new ArrayList<>(ls));
        for(int i=pos;i<nums.length;i++) {
            if(i>pos&&nums[i]==nums[i-1]) continue;
            ls.add(nums[i]);
            helper(res,ls,nums,i+1);
            ls.remove(ls.size()-1);
        }
    }
}
