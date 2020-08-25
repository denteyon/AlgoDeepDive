public class NumberSwapper {
    public static void main(String[] args) {
        swap(3, 4);
    }
    public static void swap(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a);
        System.out.println(b);
    }
}
