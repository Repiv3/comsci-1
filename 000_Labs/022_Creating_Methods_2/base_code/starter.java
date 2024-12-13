import java.util.Scanner;

public class starter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the base (x): ");
        int base = input.nextInt();

        System.out.print("Enter the exponent (y): ");
        int exponent = input.nextInt();

        int result = pow(base, exponent);

        System.out.println(base + " raised to the power of " + exponent + " is " + result);

        input.close();
    }

    public static int pow(int base, int exponent) {
        int result = 1;
        while (exponent > 0) {
            result *= base;
            exponent--;
        }
        return result;
    }
}
