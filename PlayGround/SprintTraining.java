import java.util.Arrays;
import java.util.List;

public class SprintTraining {
    public static int getMostVisited(int n, List<Integer> sprints) {
        int[] incremental = new int[n + 2];
        for (int i=0; i<sprints.size()-1; i++) {
            int start = Math.min(sprints.get(i), sprints.get(i+1));
            int end = Math.max(sprints.get(i+1), sprints.get(i));
            incremental[start] ++;
            incremental[end + 1] --;
        }
        int[] scores = new int[n+1];
        int score = 0;
        for (int i=1; i<n+1; i++) {
            score += incremental[i];
            scores[i] = score;
        }
        int maxVal = 0, maxValIndex = -1;
        for (int i=1; i<n+1; i++) {
            if (scores[i] > maxVal) {
                maxVal = scores[i];
                maxValIndex = i;
            }
        }
        return maxValIndex;
    }
    public static void main(String[] args) {
        int res = getMostVisited(6, Arrays.asList(2, 4, 1, 3));
        System.out.println(res); // 2
    }
}