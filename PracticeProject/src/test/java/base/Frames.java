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

public class Frames {

	WebDriver driver;
	Actions actions;

	@Test
	void am() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("http://omayo.blogspot.com/2013/05/page-one.html");

		actions = new Actions(driver);

		WebElement frame = driver.findElement(By.xpath("//iframe[@id='iframe2']"));

		driver.switchTo().frame(frame);

		WebElement t1 = driver.findElement(By.xpath("//h2//p"));
		String text = t1.getText();

		System.out.println(text);

		driver.quit();

	}

}
