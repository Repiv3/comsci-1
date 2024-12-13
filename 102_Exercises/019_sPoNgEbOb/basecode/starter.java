import java.util.*;

class starter {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = sc.nextLine();
        sentence = sentence.toLowerCase();
        
        while (true) {
            if (sentence.indexOf(" ") == -1) {
                System.out.print(spongeCase(sentence));
                break;
            }
            
            int space = sentence.indexOf(" ");
            String word = sentence.substring(0, space);
            System.out.print(spongeCase(word) + " ");
            
            sentence = sentence.substring(space + 1);
        }
    }

    public static String spongeCase(String word) {
        String result = "";
        for (int i = 0; i < word.length(); i++) {
            if (i % 2 == 0) {
                result += word.substring(i, i + 1).toUpperCase();
            } else {
                result += word.substring(i, i + 1);
            }
        }
        return result;
    }
}
