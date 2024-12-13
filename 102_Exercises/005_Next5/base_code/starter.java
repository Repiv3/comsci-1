import java.util.Scanner;

public class starter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int input = scanner.nextInt();

        System.out.println("Here are the next 5 numbers:");
        System.out.println(input + 1);
        System.out.println(input + 2);
        System.out.println(input + 3);
        System.out.println(input + 4);
        System.out.println(input + 5);

        System.out.println("Here are the next 5 multiples of " + input + ":");
        System.out.println(input * 1);
        System.out.println(input * 2);
        System.out.println(input * 3);
        System.out.println(input * 4);
        System.out.println(input * 5);
        
        System.out.println(input + " divided by 10 is " + (input / 10.0));

        System.out.println(input + " divided by 100 is " + (input / 100.0));
    }
}
