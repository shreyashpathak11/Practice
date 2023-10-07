package javaFeature;

import org.testng.annotations.Test;

/* Polymorphism
 * Abstraction
 * Inheritance
 * Encapsulation
 * 
 * 
 * 
 * 
 */

class Abc {

	private int a;
	private int b;

	public int getA() {

		return a;
	}

	public void setA(int a) throws Exception {

		this.a = a;

		if (a < 0) {
			throw new Exception("Please Enter Greater Than 0");
		}

	}

	public int getB() {

		return b;
	}

	public void setB(int b) {

		this.b = b;

	}

}

class Encapsulation {

	@Test
	void ab() throws Exception {

		Abc abc = new Abc();
		abc.setA(-1);
		abc.setB(10);

		System.out.println(abc.getA());
		System.out.println(abc.getB());

	}

}
