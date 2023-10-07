package javaFeature;

import java.util.Scanner;

import org.testng.annotations.Test;

public class PrimeNumbers {

	@Test
	void pm() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a number to check if it Primary");
		int number = scanner.nextInt();

		for (int i = 1; i <= number; i++) {

			if (i == 2 || i == 3 || i == 5 || i == 7) {

				System.out.println(i + " is a prime number");

			}

			if (i != 2 && i != 3 && i != 5) {

				if (i % 2 == 0 || i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {

					// System.out.println(i + " is not a Prime Number");

				}

				else {
					System.out.println(i + " is a Prime Number");
				}

			}

		}

		scanner.close();

	}

}
