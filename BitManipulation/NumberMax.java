package ctci;

public class NumberMax {
    public static void main(String[] args) {
        System.out.println(findMax(3, 8));
    }
    public static int findMax(int a, int b) {
        int xor = a ^ b;
        System.out.println(xor);
        return b;
    }
}
