package testngPractice;

import org.apache.commons.compress.harmony.pack200.NewAttribute;
import org.testng.annotations.Test;

public class DataProvider {

	@Test(dataProvider = "dt")
	void dtm(int a, int b) {

		int c = a + b;
		System.out.println("Value of C is = " +c);

	}

	@org.testng.annotations.DataProvider
	Object dt() {

		Object[][] obj = new Object[2][2];
		obj[0][0] = 2;
		obj[0][1] = 3;

		obj[1][0] = 6;
		obj[1][1] = 7;

		return obj;

	}

}
