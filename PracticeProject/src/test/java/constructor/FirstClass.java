package constructor;

import java.util.function.IntBinaryOperator;

public class FirstClass {

	int a;
	int b;

	public FirstClass(int a, int b) {

		this.a = a;
		this.b = b;

	}

	void sum() {

		int c = a + b;
		System.out.println("The Value of C: " + c);

	}

}
