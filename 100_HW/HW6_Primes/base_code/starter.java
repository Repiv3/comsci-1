import java.util.Scanner;

public class starter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the highest number to check for primes: ");
        int max = scanner.nextInt();
        printPrimes(max);
    }

    public static boolean checkPrime(int num) {
        int i = 2;
        while (i <= num / 2) {
            if (num % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }

    public static void printPrimes(int max) {
        int current = 2;
        while (current < max) {
            if (checkPrime(current)) {
                System.out.println(current);
            }
            current++;
        }
    }
}
