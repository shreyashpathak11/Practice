package stringPractice;

import org.testng.annotations.Test;

public class SplitingString {

	@Test
	void ss() {

		String s1 = "IndiaVsEngland";

		String s2 = "EnglandIndiaVs";

		String s3 = s1 + s2;

		StringBuilder sb = new StringBuilder(s3);

		StringBuilder sb2 = sb.reverse();

		String s4 = sb2.toString();

		if (s3.equalsIgnoreCase(s4)) {

			System.out.println("String is Reverse");
		}
		else {
			System.out.println("NO");
		}

	}

}
