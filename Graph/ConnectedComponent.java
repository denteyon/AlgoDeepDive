public class ConnectedComponent {
    public static void main(String[] args) {
        System.out.println(countComponents(5, new int[][]{{0, 1}, {1, 2}, {3, 4}, {2, 3}}));
    }
    public static int countComponents(int n, int[][] edges) {
        int[] root = new int[n];
        for (int i = 0; i < n; i ++) {
            root[i] = i;
        }
        int count = n;
        for (int i = 0; i < edges.length; i ++) {
            int r1 = getRoot(root, edges[i][0]);
            int r2 = getRoot(root, edges[i][1]);
            if (r1 != r2) {
                root[r1] = r2;
                count --;
            }
        }
        return count;
    }
    private static int getRoot(int[] root, int i) {
        while (root[i] != i) {
            root[i] = root[root[i]];
            i = root[i];
        }
        return i;
    }
}