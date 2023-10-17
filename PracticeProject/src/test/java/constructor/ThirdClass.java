package constructor;

import org.testng.annotations.Test;

public class ThirdClass {

	@Test
	void c() {

		SecondClass sc = new SecondClass(5, 6);
		sc.sum();

	}

}
