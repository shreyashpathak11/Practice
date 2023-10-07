package javaFeature;

import org.testng.annotations.Test;

import net.bytebuddy.implementation.bind.annotation.Super;

class A1 {

	A1(int age, String name) {

		System.out.println("This is a constructor");
		System.out.println("My age is = " + age);
		System.out.println("My Name is = " + name);

	}

}

class B1 extends A1 {

	int salary;

	B1(int age, int salary, String name) {

		super(age, name);

		this.salary = salary;

		System.out.println("My Salary is = " + salary);

			}

}

public class Constructor {

	@Test
	void c1() {

		B1 b1 = new B1(5, 6, "MyName");

	}

}
