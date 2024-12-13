import java.util.Scanner;

class starter {
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            }
            return true;
        }
        return false;
    }

    public static int getDigitSum(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    public static void printIfConsecutive(int num1, int num2, int num3) {
        if (num2 == num1 + 1 && num3 == num2 + 1) {
            System.out.println(num1 + ", " + num2 + ", " + num3 + " are consecutive.");
        } else {
            System.out.println(num1 + ", " + num2 + ", " + num3 + " are not consecutive.");
        }
    }

    public static void main(String args[]) {
        System.out.println("----------------------------------------");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        System.out.println();
        if (isLeapYear(year))
            System.out.println(year + " is a leap year!");
        else
            System.out.println(year + " is not a leap year!");

        System.out.println();
        System.out.println("----------------------------------------");
        System.out.println("Enter a 5 digit number");
        int number = sc.nextInt();
        int sum = getDigitSum(number);
        System.out.println();
        System.out.println("The sum of the digits of " + number + " is " + sum);

        System.out.println();
        System.out.println("----------------------------------------");
        System.out.println("Enter a number");
        int num1 = sc.nextInt();
        System.out.println("Enter a number");
        int num2 = sc.nextInt();
        System.out.println("Enter a number");
        int num3 = sc.nextInt();
        System.out.println();
        printIfConsecutive(num1, num2, num3);
        System.out.println();
        System.out.println("----------------------------------------");
    }
}
