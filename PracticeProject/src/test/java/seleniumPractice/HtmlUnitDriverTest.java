package seleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class HtmlUnitDriverTest {

	@Test
	void htmlTest() {

		WebDriver driver = new HtmlUnitDriver();
		Actions actions = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

		driver.get("https://www.google.com/");

		WebElement textArea = driver.findElement(By.id("APjFqb"));
		textArea.sendKeys("Cricket");

		WebElement videoElement = driver
				.findElement(By.xpath("//span[text()='Videos' and starts-with(@class,'FMKtTb')]"));
		wait.until(ExpectedConditions.visibilityOf(videoElement));
		actions.sendKeys(Keys.ENTER).perform();
		String titleString = driver.getTitle();
		System.out.println(titleString);

	}

}
