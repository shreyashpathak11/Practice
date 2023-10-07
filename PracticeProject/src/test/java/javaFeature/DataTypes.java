package javaFeature;

import org.testng.annotations.Test;

public class DataTypes {

	@Test
	void dt() {

		/*
		 * There are 8 types of Primitiv Data Types they are byte char int short boolean
		 * long double float
		 */

		int a = 127;
		double d = 3.3d;
		float f = 4.4f;
		long l = 88l;

		System.out.println(a);
		System.out.println(d);
		System.out.println(f);
		System.out.println(l);

		float f1 = (float) a;

		System.out.println(f1);
		byte b = (byte) a;
		System.out.println(b);

	}

}
