package javaFeature;

import org.testng.annotations.Test;

class A {

	int a;
	int b;

	void a() {

		System.out.println("This is Parent Class");
		System.out.println(a);
		System.out.println(b);

	}

}

class B extends A {

	void b(int a, int b) {

		super.a = a;
		super.b = b;

	}

}

public class Inheritance {

	@Test
	void c() {

		B b = new B();
		b.b(5, 6);
		b.a();

	}
}
