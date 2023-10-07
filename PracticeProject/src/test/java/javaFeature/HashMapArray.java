package javaFeature;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.testng.annotations.Test;

import com.google.common.annotations.J2ktIncompatible;

public class HashMapArray {

	@Test
	void hma() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter count of Subjects");
		int numOfSubject = sc.nextInt();

		String[] subjects = new String[numOfSubject];
		int[] marks = new int[numOfSubject];

		int totalCount = 0;

		for (int i = 0; i < numOfSubject; i++) {

			System.out.println("Please enter Name of Subject");
			subjects[i] = sc.next();
			System.out.println("Please enter marks of Subject");
			marks[i] = sc.nextInt();

		}

		for (int k = 0; k < numOfSubject; k++) {
			System.out.println("Subject is " + subjects[k] + " And " + " Marks is " + marks[k]);
		}

		for (int j = 0; j < subjects.length; j++) {

			// System.out.println("Subject is " + subjects[j] + " And " + " Marks is " +
			// marks[j]);

			if (marks[j] < 33) {

				System.out.println("You are Failed in " + subjects[j]);

			}

			else {

				totalCount = totalCount + marks[j];
			}

		}

		double percent = totalCount / numOfSubject;
		System.out.println("Your Percentage is = " + percent);

		if (percent < 100 && percent > 64) {
			System.out.println("You are passed with First Division");

		} else if (percent < 100 && percent > 33) {
			System.out.println("You are passed with Second Division");
		} else {
			System.out.println("You are Failed");
		}

		sc.close();

	}

}
