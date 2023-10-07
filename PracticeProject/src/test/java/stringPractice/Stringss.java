package stringPractice;

import org.testng.annotations.Test;

public class Stringss {

	@Test
	void substrings() {

		String a = "Hello";

		String b = a.substring(2);

		System.out.println(b);
	}

	@Test
	void substrings1() {

		String a = "Hello";

		String b = a.substring(2,2 );

		System.out.println(b);
	}

}
