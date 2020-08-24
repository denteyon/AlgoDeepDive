import java.util.Arrays;
import java.util.Random;

public class ShuffleArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(shuffle(new int[]{1, 2, 3, 4, 5, 6, 7})));
    }
    public static int[] shuffle(int[] arr) {
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            int k = rand.nextInt(i + 1); // * (max - min + 1) + min
            int temp = arr[k];
            arr[k] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }


}
