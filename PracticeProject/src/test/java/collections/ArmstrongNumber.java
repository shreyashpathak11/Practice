package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.testng.annotations.Test;

public class ArmstrongNumber {

	@Test
	void arm() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter a number to check");
		int number = sc.nextInt();

		String str = String.valueOf(number);

		char[] c = str.toCharArray();

		int sum = 0;

		List<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < c.length; i++) {

			int a = Character.getNumericValue(c[i]);

			list.add(a * a * a);

		}

		for (int i = 0; i < list.size(); i++) {

			sum = sum + list.get(i);

		}

		if (number == sum) {

			System.out.println("Arm Number");

		} else {
			System.out.println("Not Arm Number");
		}

	}

}
