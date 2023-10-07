package forLoops;

import org.testng.annotations.Test;

public class Patternt1 {

	@Test
	void pt() {

		for (int i = 0; i < 4; i++) {

			for (int j = 0; j < 10; j++) {

				System.out.print("*");

			}

			System.out.println("");

		}

	}

}
