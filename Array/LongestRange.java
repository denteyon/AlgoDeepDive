import java.util.*;

public class LongestRange {
    public static int[] largestRange(int[] array) {
        // Write your code here.
        Map<Integer, Boolean> map = new HashMap<>();

        for (int i: array) {
            map.put(i, true);
        }

        int longestLen = 0;
        int[] largestRange = new int[2];

        for (int current : array) {

            if (map.get(current)) {

                map.put(current, false);
                int currentLen = 1;
                int left = current - 1;
                int right = current + 1;

                while (map.get(left) != null && map.get(left)) {
                    map.put(left, false);
                    currentLen++;
                    left--;
                }

                while (map.get(right) != null && map.get(right)) {
                    map.put(right, false);
                    currentLen++;
                    right++;
                }

                if (currentLen > longestLen) {
                    longestLen = currentLen;
                    largestRange = new int[]{left + 1, right - 1};
                }
            }
        }
        return largestRange;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(largestRange(new int[]{1, 11, 3, 0, 15, 5, 2, 4, 10, 7, 12, 6}))); // 0, 7
        System.out.println(Arrays.toString(largestRange(new int[]{0, -5, 9, 19, -1, 18, 17, 2, -4, -3, 10, 3, 12, 5, 16, 4, 11, 7, -6, -7, 6, 15, 12, 12, 2, 1, 6, 13, 14, -2}))); // -7, 7
    }
}
