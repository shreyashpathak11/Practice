package arunMootori;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class SeleniumPractice {

	@Test
	void seleniumTest() {

		WebDriver driver = new ChromeDriver();
		Actions actions = new Actions(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://omayo.blogspot.com/2013/05/page-one.html");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		WebElement link1 = driver.findElement(By.xpath("//a[@id='link1']"));
		WebElement link2 = driver.findElement(By.xpath("//a[@id='link2']"));

		actions.moveToElement(link1).keyDown(Keys.CONTROL).click().build().perform();
		actions.moveToElement(link2).keyDown(Keys.CONTROL).click().build().perform();

		String parent = driver.getWindowHandle();

		Set<String> set = driver.getWindowHandles();

		Iterator<String> itr = set.iterator();

		String p1 = itr.next();

		while (itr.hasNext()) {

			driver.switchTo().window(p1);
			driver.switchTo().window(itr.next());

		}

		driver.switchTo().window(parent);

		List<WebElement> l1 = driver.findElements(By.xpath("//div[@id='HTML26']//descendant::li"));

		for (int i = 0; i < l1.size(); i++) {

			WebElement ele = l1.get(i);
			String aString = ele.getText();

			System.out.println(aString);

		}

	}

}
