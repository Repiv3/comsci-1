import java.util.Scanner;

public class starter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a name: ");
        String name = scanner.nextLine();

        int times;
        if (name.equalsIgnoreCase("diddy")) {
            times = 1000;
        } else {
            System.out.print("Enter the number of times to output the name: ");
            times = scanner.nextInt();
        }

        int count = 0;
        while (count < times) {
            System.out.println(name);
            count++;
        }
    }
}
