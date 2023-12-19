package testngPractice;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TPS {

	@Parameters({ "a1", "a2" })
	@Test
	void ab(String a, String b) {

		System.out.println(a);
		System.out.println(b);

	}

}
