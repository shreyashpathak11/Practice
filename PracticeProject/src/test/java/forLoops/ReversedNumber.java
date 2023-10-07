package forLoops;

import java.util.Scanner;

import org.testng.annotations.Test;

public class ReversedNumber {

	@Test
	void reser() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a Number");
		int number = sc.nextInt();

		String num = String.valueOf(number);

		char[] c = num.toCharArray();

		String newNumber = "";

		for (int i = c.length ; i > 0; i--) {

			newNumber = newNumber + i;

		}

		int newNum = Integer.valueOf(newNumber);

		System.out.println(newNum);

	}

}
