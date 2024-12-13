import java.util.Scanner;

public class starter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence in English:");
        String input = scanner.nextLine();
        System.out.println(translateToPigLatin(input));
        scanner.close();
    }

    public static String translateToPigLatin(String input) {
        String vowels = "aeiouAEIOU";
        String[] words = input.split(" ");
        String result = "";

        for (String word : words) {
            if (word.isEmpty()) {
                continue;
            }

            String firstLetter = word.substring(0, 1).toLowerCase();
            String restOfWord = word.substring(1);
            String pigLatinWord;

            if (vowels.contains(firstLetter)) {
                pigLatinWord = word + "yay";
            } else if (restOfWord.length() > 0 && !vowels.contains(restOfWord.substring(0, 1).toLowerCase())) {
                pigLatinWord = word.substring(2) + word.substring(0, 2) + "ay";
            } else {
                pigLatinWord = restOfWord + firstLetter + "ay";
            }

            result = result + pigLatinWord + " ";
        }
        return result.trim();
    }
}
