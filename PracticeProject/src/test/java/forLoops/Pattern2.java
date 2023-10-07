package forLoops;

import org.testng.annotations.Test;

public class Pattern2 {

	@Test
	void pt2() {

		for (int i = 0; i < 6; i++) {

			for (int j = 0; j <= i; j++) {

				System.out.print("*");

			}

			for (int j = 6; j >
				i; j--) {

				System.out.print("+");

			}

			System.out.println("");

		}

	}

}
