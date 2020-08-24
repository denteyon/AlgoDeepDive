import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class MergeInterval {
    public static void main(String[] args) {
        // int[][] a = {{1,3},{2,6},{8,10},{15,18}};
        // int[][] d = {{2,6},{1,3},{8,10},{15,18}};
        int[][] c = {{1,4}, {1, 6}};
        // int[][] b = {};
        int[][] ans = merge(c);
        for (int[] ints : ans) {
            System.out.println(ints[0] + " and " + ints[1]);
        }
    }
    private static int[][] merge(int[][] intervals){
        if(intervals.length==0){
            return intervals;
        }

        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });

        ArrayList<Integer[]> result = new ArrayList<>();

        int start = intervals[0][0];
        int end = intervals[0][1];

        for (int i = 0; i < intervals.length; i++) {
            if(end>=intervals[i][0] && end<=intervals[i][1]){
                    end = intervals[i][1];
            } else if (start <= intervals[i][0] && end >= intervals[i][1]) {
                continue;
            } else {
                result.add(new Integer[]{start, end});
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }
        result.add(new Integer[]{start, end});

        int[][] res = new int[result.size()][2];
        for (int i = 0; i < result.size(); i++) {
            res[i][0] = result.get(i)[0];
            res[i][1] = result.get(i)[1];
        }
        return res;
    }
}
