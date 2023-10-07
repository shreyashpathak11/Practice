package javaFeature;

import java.util.Scanner;

import org.testng.annotations.Test;

public class LargestAmongThree {

	@Test
	void largest() {

		Scanner sc = new Scanner(System.in);
		System.out.println("a");
		int a = sc.nextInt();
		System.out.println("b");
		int b = sc.nextInt();
		System.out.println("c");
		int c = sc.nextInt();

		if (a > b && a > c) {

			System.out.println("a is greatest");

		}

		else if (b > a && b > c) {

			System.out.println("b is greatest");

		}

		else {
			System.out.println("c is greatest");
		}
	}

}
