public class SumNoOp {
    public static void main(String[] args) {
        System.out.println(Sum(0, 3));
    }
    public static int Sum(int a, int b) {
        int carry = (a & b) << 1;
        int sum = (a ^ b);
        int prev = sum;
        while(carry != 0) {
            prev = sum;
            sum = (sum ^ carry);
            carry = (prev & carry) << 1;
        }
        return sum;
//        if(b==0) {
//            return a;
//        }
//        return Sum(a^b, (a&b) <<1);
    }
}
