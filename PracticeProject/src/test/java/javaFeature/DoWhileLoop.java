package javaFeature;

import org.testng.annotations.Test;

public class DoWhileLoop {

	@Test
	void dwlll() {

		int i = 0;

		do {

			System.out.println(i + " in the Do While Loop");
			i++;
		} while (i <= 10);
	}

}
