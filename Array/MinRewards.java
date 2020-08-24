import java.util.Arrays;
import java.util.stream.IntStream;

public class MinRewards {
    public static int calRewards(int[] scores) {
        int minIndex = -1;
        if (scores == null || scores.length == 0) {
            return -1;
        }
        int len = scores.length;

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < len; i++) {
            if (scores[i] < min) {
                min = scores[i];
                minIndex = i;
            }
        }
        int[] rewards = new int[len];

        int left = minIndex, right = minIndex + 1;
        int reward = 1;
        rewards[left--] = reward;
        while (left >= 0) {
            if (scores[left] > scores[left + 1]) {
                rewards[left] = ++reward;
            } else {
                rewards[left] = 1;
                reward = 1;
            }
            left--;
        }
        reward = 1;
        while (right < len) {
            if (scores[right] > scores[right - 1]) {
                rewards[right] = ++reward;
            } else {
                rewards[right] = 1;
                reward = 1;
            }
            right++;
        }

        System.out.println(Arrays.toString(rewards));

        return IntStream.of(rewards).sum();
    }

    public static void main(String[] args) {
        System.out.println(calRewards(new int[]{8, 4, 2, 1, 3, 6, 7, 9, 5}));
        System.out.println(calRewards(new int[]{1, 2}));
    }
}
