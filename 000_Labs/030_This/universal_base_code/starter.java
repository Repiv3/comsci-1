import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static String randName() {
		int rand = (int)(Math.random() * 7);
		switch(rand) {
			case 0: return "Dopey"; 
			case 1: return "Bashful";
			case 2: return "Grumpy";
			case 3: return "Sleepy";
			case 4: return "Sneezy";
			case 5: return "Happy";
			case 6: return "Doc";
			default: return "Happy";
		}
	}

	public static void main(String args[]) {
		PooleDwarf[] dwarfs = new PooleDwarf[7];
		Random rand = new Random();

		for (int i = 0; i < dwarfs.length; i++) {
			dwarfs[i] = new PooleDwarf(randName(), rand.nextInt(100));
		}

		String firstName = dwarfs[0].getName();
		int duplicates = 0;

		for (int i = 1; i < dwarfs.length; i++) {
			if (dwarfs[i].isSameName(firstName)) {
				duplicates++;
			}
		}

		System.out.println("First dwarf's name: " + firstName);
		System.out.println("Number of duplicates: " + duplicates);
	}
}
