package forLoops;

import java.util.Scanner;

import org.testng.annotations.Test;

public class Table {

	@Test
	void table() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a number");

		int n = scanner.nextInt();

		for (int i = 1; i <= 10; i++) {

			System.out.println(n * i);

		}

		scanner.close();

	}

}
