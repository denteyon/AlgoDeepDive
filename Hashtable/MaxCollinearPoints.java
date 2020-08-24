import java.util.HashMap;
import java.util.Map;

class MaxCollinearPoints {
    public static void main(String[] args) {
        System.out.println(maximumCollinearPoints(new int[][]{{0, 1}, {1, 0}, {2, 0}})); // 2
        System.out.println(maximumCollinearPoints(new int[][]{{0, 1}, {1, 0}, {2, 0}, {10, 0}})); // 3
        System.out.println(maximumCollinearPoints(new int[][]{{1, 1}, {1, 1}, {1, 1}})); // 4
    }
    public static int maximumCollinearPoints(int[][] points) {
        int len = points.length;

        if (len < 3) {
            return len;
        }

        int maxCount = 0;

        for (int i = 0; i < len; i++) {
            Map<Double, Integer> map = new HashMap<>();
            int currentMax = 0;

            for (int j = 0; j < len; j++) {
                if (i != j) {
                    double slope = 0.0;
                    if (points[i][0] == points[j][0] && points[j][1] == points[i][1]) {
                        slope = Double.NEGATIVE_INFINITY;
                    } else if (points[i][0] == points[j][0]) {
                        slope = Double.POSITIVE_INFINITY;
                    } else {
                        slope = (float) (points[j][1] - points[i][1]) / (points[j][0] - points[i][0]);
                    }

                    if (map.get(slope) == null) {
                        map.put(slope, 1);
                    } else {
                        map.put(slope, map.get(slope) + 1);
                    }
                    double infinity = Double.NEGATIVE_INFINITY;
                    if (map.get(infinity) != null && slope != infinity) {
                        currentMax = Math.max(currentMax, map.get(slope) + map.get(infinity));
                    } else {
                        currentMax = Math.max(currentMax, map.get(slope));
                    }

                }
            }
            maxCount = Math.max(maxCount, currentMax + 1);
        }
        return maxCount;
    }
}