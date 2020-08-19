import java.util.Arrays;
import java.util.Random;

public class ReservoirSampling {
    public static void main(String[] args) {
        // Defining the parameters
        int n = 8;
        int k = 4;
        // The array to be smaples
        int[] input = {1, 7, 4, 8, 2, 6, 5, 9};
        int[] output = new int[k];
        int i;
        // Initialzing the output array to the first k
        // elements of the input array
        for(i = 0; i < k; i++){
            output[i] = input[i];
        }
        int j;
        Random num = new Random();
        // Iterating from k to n-1
        for(j = i; j < n; j++){
            // Generating a randon number from 0 to j
            int index = num.nextInt(j + 1);
            System.out.println(j + " " + index);
            // Replacing an element in the  output with an element
            // in the input if the randomly generated number is less
            // than k.
            if(index < k){
                output[index] = input[j];
            }
        }
        System.out.println("Input array:");
        System.out.println(Arrays.toString(input));
        System.out.println("Output array:");
        System.out.println(Arrays.toString(output));

    }
}