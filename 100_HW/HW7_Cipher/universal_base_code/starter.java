import pkg.*;
import java.util.Scanner;

public class starter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an encoded message: ");
        String encodedMessage = scanner.nextLine().trim();qd4

        System.out.print("Do you have a key for decoding? (yes/no): ");
        String hasKey = scanner.nextLine().trim();
        
        String decodedMessage;

        if (hasKey.equalsIgnoreCase("yes")) {
            System.out.print("Enter the key: ");
            double key = Double.parseDouble(scanner.nextLine().trim());
            decodedMessage = Cipher.keyedEncode(encodedMessage, (int) key);
        } else {
            decodedMessage = Cipher.encode(encodedMessage);
        }

        System.out.println("Decoded message: " + decodedMessage);
    }
}
