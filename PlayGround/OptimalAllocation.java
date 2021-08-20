import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class OptimalAllocation {
    public static void main(String[] args) {
        int[][] foreground = new int[][]{{1, 2}, {2, 4}, {3, 6}};
        int[][] a = {{1, 3},{2, 5},{3, 7},{4, 10}};
        int[][] b = {{1, 2},{2, 3},{3, 4},{4, 5}};
        int[][] background = new int[][]{{1, 2}};
        int target = 10;
        List<Integer[]> result = search(a, b, target);
        for (Integer[] i: result) {
            System.out.print(Arrays.toString(i) + " ");
        }
    }

    public static List<Integer[]> search(int[][] foreground, int[][] background, int target) {
        Arrays.sort(foreground, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });
        Arrays.sort(background, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });

        int m = foreground.length;
        int n = background.length;
        int maxSum = Integer.MIN_VALUE;
        List<Integer[]> result = new ArrayList<>();

        int left = 0;
        int right = n - 1;

        while (left < m && right >= 0) {
            int temp = foreground[left][1] + background[right][1];

            if (temp > target) {
                right--;
            } else {
                if (maxSum <= temp) {
                    if (maxSum < temp) {
                        maxSum = temp;
                        result.clear();
                    }

                    result.add(new Integer[]{foreground[left][0], background[right][0]});

                    int index = right - 1;
                    while(index >= 0 && background[index][1] == background[right][1]){
                        result.add(new Integer[]{foreground[left][0],background[index--][0]});
                    }
                }

                left++;
            }
        }
        return result;
    }
}
