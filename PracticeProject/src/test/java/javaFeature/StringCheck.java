package javaFeature;

import org.testng.annotations.Test;

public class StringCheck {

	@Test
	void sc() {

		int a = 1234567890;

		String s = String.valueOf(a);
		System.out.println(s);

		char[] c = s.toCharArray();

		String s1 = "";

		for (int i = c.length - 1; i >= 0; i--) {

			 s1 = s1 + c[i];
			// 
			 s1 = c[i] + s1;

		}

		System.out.println(s1);

		int a1 = Integer.parseInt(s1);
		System.out.println(a1);

	}

}
