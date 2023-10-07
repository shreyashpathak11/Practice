package base;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ControlClick {

	WebDriver driver;
	Actions actions;

	@Test
	void am() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("http://omayo.blogspot.com/2013/05/page-one.html");

		actions = new Actions(driver);

		WebElement blogs = driver.findElement(By.xpath("//span[@id='blogsmenu']"));

		actions.moveToElement(blogs).perform();

		WebElement option1 = driver.findElement(By.xpath("//span[text()='Selenium143']"));

		actions.moveToElement(option1).keyDown(Keys.CONTROL).click().build().perform();

		WebElement option2 = driver.findElement(By.xpath("//span[text()='SeleniumByArun']"));

		actions.moveToElement(option2).click().build().perform();

		WebElement option3 = driver.findElement(By.xpath("//span[text()='SeleniumOneByArun']"));

		actions.moveToElement(option3).click().build().perform();

		actions.keyUp(Keys.CONTROL).perform();

		String parent = driver.getWindowHandle();

		Set<String> windows = driver.getWindowHandles();

		Iterator<String> itr = windows.iterator();

		while (itr.hasNext()) {

			driver.switchTo().window(itr.next());

			String title = driver.getTitle();

			System.out.println(title);

			if (title.contains("Selenium")) {

				driver.close();
			}

		}

		// driver.switchTo().window(parent);

	// driver.close();

	 driver.quit();

	}

}
