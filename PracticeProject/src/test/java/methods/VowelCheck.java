package methods;

import java.util.Scanner;

import org.testng.annotations.Test;

public class VowelCheck {

	@Test
	void mainMethod() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a character");
		char c = sc.next().charAt(0);
		System.out.println("It contains " + vCheck(c));

		Scanner sc1 = new Scanner(System.in);
		System.out.println("Please enter a name");
		String name = sc1.nextLine();
		System.out.println("Vowel Count is " + vCount(name));

	}

	public static int vCount(String name) {

		char[] n = name.toCharArray();

		int count = 0;

		for (int i = 0; i < n.length; i++) {

			if (n[i] == 'a' || n[i] == 'e' || n[i] == 'i' || n[i] == 'o' || n[i] == 'u') {

				count++;

			}

		}

		return count;
	}

	public static boolean vCheck(char c) {

		boolean check = false;

		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {

			check = true;

		}

		else {

			check = false;
		}

		return check;
	}

}
