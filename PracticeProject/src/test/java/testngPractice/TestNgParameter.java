package testngPractice;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNgParameter {

	@Parameters({ "a" })

	@Test()

	void parameterss(String browser) {

		System.out.println(" a = " + browser);

	}

}
