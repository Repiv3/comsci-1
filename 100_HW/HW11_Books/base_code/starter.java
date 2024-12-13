import java.util.*;
import java.io.*;

class starter {
	public static void main(String args[]) throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the file name of one of the text files in the \'books\' folder: (Ex: test.txt)");
		String textFile = sc.nextLine(); // Get the file name from the user.
		String[] arr = fillArray(textFile); // Fill the array with words from the file.
		System.out.println();

		while (true) {
			System.out.println("What action would you like to take?");
			System.out.println("1. Check text file (file)");
			System.out.println("2. Print the text (print)");
			System.out.println("3. Print the text backwards (printBack)");
			System.out.println("4. Print a certain number of words (printNum)");
			System.out.println("5. Change the text file (change)");
			System.out.println("6. Check how many times a word appears (check)");
			System.out.println("7. Find the most common word (common)");
			System.out.println("Enter 'exit' to quit.");
			String choice = sc.nextLine();

			if (choice.equals("exit")) {
				System.out.println("Goodbye!");
				break;
			}

			// Actions based on the user's choice.
			if (choice.equals("file")) {
				System.out.println("You are currently using the file: " + textFile);
			} else if (choice.equals("print")) {
				printsArray(arr);
			} else if (choice.equals("printBack")) {
				printsArrayBack(arr);
			} else if (choice.equals("printNum")) {
				System.out.println("Enter the number of words to print:");
				int num = sc.nextInt();
				sc.nextLine(); // Consume newline
				printsNumber(arr, num);
			} else if (choice.equals("change")) {
				System.out.println("Enter the new file name:");
				textFile = sc.nextLine();
				arr = fillArray(textFile);
				System.out.println("File changed to " + textFile);
			} else if (choice.equals("check")) {
				System.out.println("Enter the word to check:");
				String word = sc.nextLine();
				int count = checksArray(arr, word);
				System.out.println("The word '" + word + "' appears " + count + " times.");
			} else if (choice.equals("common")) {
				String commonWord = mostCommon(arr);
				System.out.println("The most common word is: " + commonWord);
			} else {
				System.out.println("Invalid option. Try again.");
			}
			System.out.println("----------");
		}
	}


	/* ---------------------------------------------------------------------------------------
		The printsArray method prints the entire array of words as a block of text.
	*/
	public static void printsArray(String[] arr) {
		StringBuilder paragraph = new StringBuilder();
		for (String word : arr) {
			paragraph.append(word).append(" ");
		}
		System.out.println(paragraph.toString().trim());
	}


	/* ---------------------------------------------------------------------------------------
		The printsArrayBack method prints the entire array of words in reverse order.
	*/
	public static void printsArrayBack(String[] arr) {
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.println(arr[i]);
		}
	}


	/* ---------------------------------------------------------------------------------------
		The printsNumber method prints "num" words from the array.
		If num is too large, it tells the user to try again.
	*/
	public static void printsNumber(String[] arr, int num) {
		if (num > arr.length) {
			System.out.println("Number too large. Try again.");
			return;
		}
		for (int i = 0; i < num; i++) {
			System.out.println(arr[i]);
		}
	}


	/* ---------------------------------------------------------------------------------------
		The checksArray method counts how many times a specific word appears in the array.
	*/
	public static int checksArray(String[] arr, String check) {
		int count = 0;
		for (String word : arr) {
			if (word.equals(check)) {
				count++;
			}
		}
		return count;
	}


	/* ---------------------------------------------------------------------------------------
		The mostCommon method finds the word that appears the most in the array.
	*/
	public static String mostCommon(String[] arr) {
		HashMap<String, Integer> wordCount = new HashMap<>();
		for (String word : arr) {
			wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
		}
		String mostCommonWord = "";
		int maxCount = 0;
		for (String word : wordCount.keySet()) {
			if (wordCount.get(word) > maxCount) {
				mostCommonWord = word;
				maxCount = wordCount.get(word);
			}
		}
		return mostCommonWord;
	}


	/* ---------------------------------------------------------------------------------------
		The fillArray method reads words from a text file and returns them as an array.
	*/
	public static String[] fillArray(String arg) throws FileNotFoundException {
		File text = new File("./books/" + arg);
		Scanner sc = new Scanner(text);
		ArrayList<String> words = new ArrayList<>();
		while (sc.hasNext()) {
			words.add(sc.next());
		}
		return words.toArray(new String[0]);
	}

}
