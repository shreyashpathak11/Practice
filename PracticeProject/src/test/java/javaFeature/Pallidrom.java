package javaFeature;

import java.util.Scanner;

import org.testng.annotations.Test;

public class Pallidrom {

	@Test
	void pallindrome() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a name");
		String name = sc.next();

		char[] c = name.toCharArray();
		System.out.println(c.length);

		String s = " ";

		for (int i = c.length-1 ; i >= 0; i--) {

			s = s+c[i] ;
		
		}

	System.out.println(s + " is ");

	}

}
