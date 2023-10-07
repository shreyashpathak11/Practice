package arrayss;

import java.util.Scanner;

import org.testng.annotations.Test;

public class TenArraysSum {

	@Test
	void arrays() {

		int[] arr = new int[5];

		Scanner sc = new Scanner(System.in);

		int sum = 0;

		for (int i = 0; i < arr.length; i++) {

			System.out.println("Please enter arr[" + i + "]");
			arr[i] = sc.nextInt();

			sum = sum + arr[i];
		}

		System.out.println(sum);
		System.out.println("Yes");
	}

}
