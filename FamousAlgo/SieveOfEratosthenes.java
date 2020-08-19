public class SieveOfEratosthenes {
    public static void sieveOfEratosthenes(int n) {
        // Create a boolean array "prime[0..n]" and initialize 
        // all entries it as true. A value in prime[i] will 
        // finally be false if i is Not a prime, else true. 
        boolean[] primes = new boolean[n + 1];

        for (int i = 0; i < n; i++) {
            primes[i] = true;
        }

        for (int p = 2; p * p <= n; p++) { // p * p instead of p for faster runtime
            
            if (primes[p]) {
                // cross out all multiples of p except p
                for (int i = p * p; i <= n; i += p) {
                    primes[i] = false;
                }
            }
        }

        for (int i = 2; i <= n; i++) {
            if (primes[i]) {
                System.out.print(i + " ");
            }
        }
    }

    // Driver Program to test above function 
    public static void main(String args[]) {
        int n = 30;
        System.out.print("Following are the prime numbers ");
        System.out.println("smaller than or equal to " + n);
        sieveOfEratosthenes(n);
    }
} 