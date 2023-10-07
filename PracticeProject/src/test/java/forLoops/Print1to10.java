package forLoops;

import org.testng.annotations.Test;

public class Print1to10 {

	@Test
	void printFirstTen() {

		int sum = 0;

		for (int i = 1; i <= 10; i++) {

			System.out.print(i + " ");

			sum = sum + i;

		}

		System.out.println("\n" + sum);

	}

}
