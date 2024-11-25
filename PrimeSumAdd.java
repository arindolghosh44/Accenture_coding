import java.util.Scanner;

public class PrimeSumAdd {

    // Function to check if a number is prime
    public static boolean isPrime(int N) {
        if (N < 2) return false; // Handle edge case for numbers less than 2

        for (int i = 2; i <= Math.sqrt(N); i++) {
            if (N % i == 0) {
                return false; // If divisible, not prime
            }
        }
        return true; // Prime number
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // Input the upper limit

        if (n < 2) {
            System.out.println(0); // If n < 2, sum of primes is 0
            sc.close();
            return;
        }

        int sum = 0;

        // Calculate the sum of all prime numbers up to n
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }

        System.out.println(sum); // Output the sum of primes

        sc.close();
    }
}
