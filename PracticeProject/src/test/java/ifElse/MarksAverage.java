package ifElse;
import static org.testng.Assert.assertFalse;

import java.util.Scanner;

import org.testng.annotations.Test;

public class MarksAverage {

	@Test
	void averageMarks() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter Three Numbers, First Number is ");
		int a = sc.nextInt();

		System.out.println("Second Number is ");
		int b = sc.nextInt();

		System.out.println("Third Number is ");
		int c = sc.nextInt();

		int sum = a + b + c;

		int average = sum / 3;

		if (average < 100 && average >= 90) {

			System.out.println("A");
		}

		else if (average >= 80 && average < 90) {

			System.out.println("B");

		}

		else if (average >= 70 && average < 80) {

			System.out.println("C");

		}

		else if (average >= 60 && average < 70) {

			System.out.println("D");

		}

		else {
			System.out.println("E");
		}

	}

}
