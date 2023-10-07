package javaFeature;

import org.testng.annotations.Test;

public class Sorting {

	@Test
	void sorting() {

		int[] a = { 50, 40, 30, 100, 90 };

		for (int i = 0; i < a.length; i++) {

			System.out.println(a[i]);

		}

		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a.length -1; j++) {

				if (a[j] > a[j + 1]) {

					int k = a[j];
					a[j] = a[j + 1];
					a[j + 1] = k;

				}

			}

		}

		System.out.println("\n");

		for (int i = 0; i < a.length; i++) {

			System.out.println(a[i]);

		}

	}

}
