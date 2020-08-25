public class ValidMatrix {
    public static boolean isValid(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return true;
        }

        int len = matrix[0].length;
        for (int i = 1; i < matrix.length; i++) {
            if (len != matrix[i].length) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isValid(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}})); //true
        System.out.println(isValid(new int[][]{{1, 2, 3}, {4, 5}, {7, 8, 9}})); //false
    }
}