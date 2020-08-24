public class RotateMatrix {
    public static void main(String[] args) {

    }
    public static void rotate(int[][] arr) {
        if (arr.length == 0 || arr.length != arr[0].length) {
            return;
        }
        int n = arr.length;
        for (int layer = 0; layer < n/2; layer++) {
            int first = layer;
            int last = layer - first - 1;
            for (int i = 0; i < last; i++) {
                int offset = i - first;
                int top = arr[first][i];
                arr[first][i] = arr[last - offset][first];
                arr[last - offset][first] = arr[last][last - offset];
                arr[last][last - offset] = arr[i][last];
                arr[i][last] = top;
            }
        }
    }
}
