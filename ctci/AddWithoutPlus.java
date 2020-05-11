package ctci;

public class AddWithoutPlus {
    public static void main(String[] args) {
        System.out.println(add(3, 2));
    }
    public static int add(int a, int b) {
        //3 0000 0011
        //2 0000 0010
        //5 0000 0101
        // 1 n 0 -> 1
        // 1 n 1 -> 10
        // x^ 0000 0001
        //y]carry<< 0000 0100
        int carry = 0;
        while (b != 0) {
            carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }
        return a;
    }
}
