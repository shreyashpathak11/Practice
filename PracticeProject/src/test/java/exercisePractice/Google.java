package exercisePractice;

import java.sql.Driver;

import org.testng.annotations.Test;

import bsh.commands.dir;
import seleniumPractice.Setup;

public class Google extends Setup {

	@Test
	void google() {

		browser("https://www.google.com/");

		String title = driver.getTitle();
		System.out.println(title);

		if (title.equalsIgnoreCase("Google")) {

			System.out.println("Pass");

		}

		driver.quit();

	}

}
