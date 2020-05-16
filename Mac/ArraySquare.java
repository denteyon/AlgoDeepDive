import java.util.Arrays;

public class ArraySquare {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortedSquares(new int[]{-7, -3, 2, 3, 11})));
    }
    public static int[] sortedSquares(int[] A) {
        int last = A.length - 1;
        int first = 0;

        int count = last;

        int[] res = new int[A.length];

        while(last > first) {
            if(Math.abs(A[last]) >= Math.abs(A[first])) {
                res[count--] = A[last] *A[last];
                last--;
            } else {
                res[count--] = A[first] *A[first];
                first++;
            }
        }

        if(last == first) {
            res[first] = A[first] * A[first];
        }

        return res;

    }
}
