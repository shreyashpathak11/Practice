package LoopsPattern;

import org.testng.annotations.Test;

public class RightTriangle {

	@Test
	void rtriangle() {

		for (int i = 0; i < 5; i++) {

			for (int j = 5; j > i; j--) {

				System.out.print(" ");

			}

			for (int j = 0; j < i; j++) {

				System.out.print("*");

			}

			System.out.println("");

		}

	}

}
