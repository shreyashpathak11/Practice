package methods;

import org.testng.annotations.Test;

public class OddEven {

	@Test
	void test() {

		System.out.println(isEven(51));

	}

	public static boolean isEven(int a) {

		boolean b = false;

		if (a % 2 == 0) {

			b = true;

		} else {
			b = false;
		}

		return b;
	}

}
