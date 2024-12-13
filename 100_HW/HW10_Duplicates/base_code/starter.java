import java.util.*;
import java.util.Random;

public class starter {
    public static void main(String[] args) {
        int[] array = new int[20];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10) + 1;
        }

        System.out.print("Array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        int target = random.nextInt(10) + 1;
        System.out.println("Target number: " + target);

        System.out.print("Indexes of duplicates: ");
        int duplicateCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                System.out.print(i + " ");
                duplicateCount++;
            }
        }
        System.out.println();
        System.out.println("Total duplicates: " + duplicateCount);

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[i + 1]) {
                System.out.println("Consecutive numbers found: " + array[i] + " at indexes " + i + " and " + (i + 1));
            }
        }
    }
}
