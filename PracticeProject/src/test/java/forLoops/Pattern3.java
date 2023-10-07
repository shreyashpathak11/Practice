package forLoops;

import org.testng.annotations.Test;

public class Pattern3 {

	@Test
	void pt3() {

		int a = 17;
		int b = 15;
		a = a + b / 4;
		int c = a % 3 + 4;
		double x = 17 / 3 + 6.5;
		double y = a / 4.0 + 15 % 4 - 3.5;

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(x);
		System.out.println(y);

	}

}
