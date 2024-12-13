import pkg.*;
import java.util.Scanner;
import java.util.Random;

public class starter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a phrase: ");
        String phrase = scanner.nextLine();
        System.out.println("Original phrase: " + phrase);
        String[] words = phrase.split(" ");
        String reversed = "";
        for (int i = words.length - 1; i >= 0; i--) {
            reversed += words[i] + " ";
        }
        System.out.println("Reversed phrase: " + reversed.trim());
    }
}
