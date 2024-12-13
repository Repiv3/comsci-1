import java.util.Scanner;

class LectureInput{
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter your name ");
    String name = sc.nextLine();
    System.out.println("Hello " + name);
    System.out.println("Please give me a number");
    int number = sc.nextInt();
    sc.nextLine();
    System.out.println("Please give me another number");
    int number2 = sc.nextInt();
    sc.nextLine();
    System.out.println("the sum of these numbers are " + (number + number2));
	System.out.println("whats your favorite food ");
	String food = sc.nextLine();
	
        
        
    }
}