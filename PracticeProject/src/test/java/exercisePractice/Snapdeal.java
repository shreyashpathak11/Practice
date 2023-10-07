package exercisePractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import seleniumPractice.Setup;

public class Snapdeal extends Setup {

	@Test
	void snapdeal() {

		String url = "https://www.snapdeal.com/";
		browser(url);

		WebElement signin = driver.findElement(By.xpath("//span[text()='Sign In']"));
		WebElement login = driver.findElement(By.xpath("//i[@class='account-icon footerIconsImg']"));

		actions.moveToElement(signin).perform();
		wait.until(ExpectedConditions.visibilityOf(login));
		actions.moveToElement(login).click().build().perform();

	}

}
