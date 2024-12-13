import java.util.*;
import java.io.*;

class starter {
    public static void main(String args[]) throws Exception {
        // Creating File instance to reference text file in Java
        File text = new File("./passwords.txt"); // This file must be in the same folder as your java/class files.

        // Creating Scanner instance to read File in Java
        Scanner numLines = new Scanner(text); // Scanner for counting number of lines
        Scanner sc = new Scanner(text); // New Scanner for taking in the lines.

        // Count number of lines in text file.
        int count = 0;
        while (numLines.hasNextLine()) { // Checks if there's a nextLine, breaks if none found.
            numLines.nextLine();
            count++;
        }

        String[] passwords = new String[count]; // This is the array you will be using.

        // Reading each line of the file using Scanner class
        int i = 0;
        while (sc.hasNextLine()) { // Checks if there's a nextLine, breaks if none found.
            String line = sc.nextLine();
            passwords[i] = line;
            i++;
        }

        int s1 = 0;
        int s2 = 0;
        int s3 = 0;

        for (int m = 0; m < passwords.length; m++) {
            String pass = passwords[m];
            boolean flag1 = false;
            boolean flag2 = false;
            if (pass.length() >= 8) {
                s1++;
                flag1 = true;
            }
            if (pass.contains("!") || pass.contains("@") || pass.contains("#") || pass.contains("$") || pass.contains("%") || pass.contains("^") || pass.contains("*") || pass.contains("&")) {
                s2++;
                flag2 = true;
            }
            if (flag1 && flag2) {
                s3++;
            }
        }

        System.out.println("Strength 1: " + (s1 - s3));
        System.out.println("Strength 2: " + (s2 - s3));
        System.out.println("Strength 3: " + s3);
    }
}
