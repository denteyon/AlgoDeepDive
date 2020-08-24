import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Flatten2dVector {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {4, 5}};
        List<Integer> list = flatten(a);
        System.out.println(Arrays.toString(list.toArray()));
    }
    public static List<Integer> flatten(int[][] arr) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                result.add(arr[i][j]);
            }
        }
        return result;
    }
}
