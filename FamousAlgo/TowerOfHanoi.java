public class TowerOfHanoi {
    public static void solve(int n, String A, String B, String C) {
        if (n == 1) {
            System.out.println(A + " -> " + C);
        } else {
            solve(n - 1, A, C, B);
            System.out.println(A + " -> " + C);
            solve(n - 1, B, A, C);
        }
    }

    public static void main(String[] args) {
        int discs = 4;
        solve(discs, "A", "B", "C");
    }
}
