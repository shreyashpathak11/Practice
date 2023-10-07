package seleniumPractice;

import java.time.Duration;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Setup {

	public WebDriver driver;
	public static WebDriverWait wait;
	public Actions actions;

	public void browser(String url) {

		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get(url);

		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		actions = new Actions(driver);

	}
}
