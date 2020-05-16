import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Rank {
    public static void main(String[] args) {
        int[] a = {100, 100, 50, 40, 40, 20, 10};
        int[] b = {5, 25, 50, 125};
        int[] c = climbingLeaderboard(a, b);
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }
    }
    static int[] climbingLeaderboard(int[] scores, int[] alice) {

        Arrays.sort(scores);
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        int rank = 1;

        int[] result = new int[alice.length];
        int count = 0;

        for(int i=scores.length-1; i>=0;i--){
            if(!map.containsValue(scores[i])){
                map.put(rank, scores[i]);
                rank++;
            }
        }

        for(int i=0;i<alice.length;i++){
            for(int j=1;j<=map.size();j++){
                if(map.get(j)<=alice[i]){
                    result[count++] = j;
                    break;
                }
                if(j==map.size()){
                    result[count++] = j+1;
                }
            }
        }
        return result;
    }
}
