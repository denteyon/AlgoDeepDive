public class MaxSwap {
    public static void main(String[] args) {
        System.out.println(maximumSwap(7284));
//        System.out.println(maximumSwap(4321));
    }
    public static int maximumSwap(int num) {
        char[] A = Integer.toString(num).toCharArray();
        int[] last = new int[10];
        for (int i = 0; i < A.length; i++) {
            last[A[i] - '0'] = i;
        }

        for (int i = 0; i < A.length; i++) {
            for (int d = 9; d > A[i] - '0'; d--) {
                if (last[d] > i) {
                    char tmp = A[i];
                    A[i] = A[last[d]];
                    A[last[d]] = tmp;
                    return Integer.parseInt(String.valueOf(A));
                }
            }
        }
        return num;
    }
}