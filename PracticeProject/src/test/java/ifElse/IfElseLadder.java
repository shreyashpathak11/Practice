package ifElse;
import java.util.Scanner;

import org.testng.annotations.Test;

public class IfElseLadder {

	@Test
	void ladder() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number");
		int calls = sc.nextInt();

		double charges = 0;

		if (calls <= 100) {

			charges = 200;
		}

		else if (calls > 100 && calls <= 150) {

			charges = 200 + (calls * .50);

		}

		System.out.println(charges);

	}

}
