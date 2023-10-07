package seleniumPractice;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WebTablePractice extends Setup {

	@Test
	void webTableMethod() {

		String url = "http://omayo.blogspot.com/2013/05/page-one.html";
		browser(url);

		String nameText = "";
		String placeText = "";

		for (int i = 1; i <= 4; i++) {

			WebElement age = driver.findElement(By.xpath("//table//tbody//tr[" + i + "]"));
			String agedString = age.getText();
			System.out.println(agedString);

//			if (ageNum >= 29) {
//				WebElement name = age.findElement(By.xpath("preceding-sibling::td"));
//				nameText = name.getText();
//				System.out.println(nameText);
//
//			}

		}

	}

}