package exercisePractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.base.StandardSystemProperty;

import seleniumPractice.Setup;

public class QATechHub {

	@Test
	void qaTechHub() {

		String url = "https://qatechhub.com/";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to(url);

		String actual = "QA Automation Tools Trainings and Tutorials | QA Tech Hub";
		String expected = driver.getTitle();
		Assert.assertEquals(actual, expected);

		if (expected.equals(actual)) {
			System.out.println("Pass");

		} else {
			System.out.println("Fail");
		}

		String fbUrl = "https://www.facebook.com/";
		driver.navigate().to(fbUrl);

		String afterNavigation = driver.getCurrentUrl();
		System.out.println("After Navigation URL is = " + afterNavigation);

		driver.navigate().back();
		String navigationBack = driver.getCurrentUrl();
		System.out.println("After Navigation back URL is = " + navigationBack);

		driver.navigate().forward();
		System.out.println("Navigation Forward URL is =" + driver.getCurrentUrl());
		driver.navigate().refresh();
		System.out.println("Navigation Refresh URL is =" + driver.getCurrentUrl());

		driver.quit();

	}

}
