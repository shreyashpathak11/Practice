package stringPractice;

import java.util.Scanner;

import org.testng.annotations.Test;

public class HoursMinutesSeconds {

	@Test
	void hms() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number");
		int value = sc.nextInt();
		int hours = value / 3600;

		int minutes = value % 3600;
		int min = minutes / 60;

		int seconds = minutes % 60;

		System.out.println("Hours = " + hours);
		System.out.println("Minutes = " + min);
		System.out.println("Second = " + seconds);

	}

}
