import pkg.*;
import java.util.Scanner;

public class starter1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the encoded message: ");
        String encodedMessage = scanner.nextLine();

        for (int key = 1; key <= 36; key++) {
            String decodedMessage = Cipher.keyedEncode(encodedMessage, key);
            
            System.out.println("Key " + key + ": " + decodedMessage);
        }
    }
}
