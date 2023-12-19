package arrayss;

import org.testng.annotations.Test;

public class NumberOfElements {

	@Test
	void noe() {

		int[] a = { 1, 2, 3, 4, 5 };

		int aSize = a.length;

		System.out.println("Size = " + aSize);

		for (int a1 : a) {

			System.out.println(a1);
		}

	}

}
