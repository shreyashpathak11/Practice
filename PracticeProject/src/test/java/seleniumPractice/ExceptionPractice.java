package seleniumPractice;

import java.net.SocketException;
import java.sql.Driver;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ExceptionPractice {

	WebDriver driver = new ChromeDriver();

	void invalidArgumentExceptions() throws SocketException {

		driver.get("www.google.com");

		// Occurs when we does not provide https// or http// before www.google.com.

		// driver.get("https://www.google.com");

		System.out.println("Hello");

		driver.quit();

	}

	void NoSuchelementExceptions() {

		driver.get("https://www.google.com");
		WebElement ele = driver.findElement(By.xpath("abc"));
		ele.click();

		// Occurs when driver does not able to locate the element to perform the action.

	}

	@Test
	void NoSuchWindowException() {

		driver.get("https://www.google.com");

		Set<String> s = driver.getWindowHandles();
		Iterator<String> r = s.iterator();

		String s1 = "abc";
		String s2 = "def";

		driver.switchTo().window(s2);

		// Occurs when driver does not able to found the window with this String ID.

	}

	@Test
	void NoSuchFrameException() {

		driver.get("https://www.google.com");

		Set<String> s = driver.getWindowHandles();
		Iterator<String> r = s.iterator();

		String s1 = "abc";
		String s2 = "def";

		driver.switchTo().frame(2);

		// Occurs when driver does not able to found the frame with this given frame
		// index ID.

	}

}
