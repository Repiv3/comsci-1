import pkg.*;
import java.util.Scanner;
import java.util.Random;

public class starter {
    public static void main(String[] args) {
        Random random = new Random();
        int arraySize = random.nextInt(150) + 51;
        int[] numbers = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            numbers[i] = random.nextInt(100) + 1;
        }

        int min = numbers[0];
        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
        }

        int max = numbers[0];
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }

        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        double average = (double) sum / arraySize;

        System.out.println("Array size: " + arraySize);
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
        System.out.println("Average value: " + average);
    }
}
