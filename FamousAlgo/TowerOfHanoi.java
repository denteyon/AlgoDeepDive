public class TowerOfHanoi {
    public static void solve(int n, String A, String B, String C) {
        if (n == 1) {
            System.out.println(A + " -> " + C); //last disc
        } else {
            solve(n - 1, A, C, B); // move n - 1 disc from A to C using B
            System.out.println(A + " -> " + C); // move last disc
            solve(n - 1, B, A, C); //move back n - 1 disc from B to C using A
        }
    }

    public static void main(String[] args) {
        int discs = 4;
        solve(discs, "A", "B", "C");
    }
}
