package testngPractice;

import java.time.Duration;

import org.apache.poi.xslf.util.PPTX2PNG;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DP {

	@Test(dataProvider = "dps")
	void dataProvider(String un, String ps) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		WebElement username = driver.findElement(By.name("email"));
		username.sendKeys(un);

		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys(ps);

		WebElement login = driver.findElement(By.xpath("//input[@value='Login']"));
		login.click();

	}

	@DataProvider
	Object[][] dps() {

		Object[][] a = new Object[3][2];
		a[0][0] = "Shreyash";
		a[0][1] = "Pathak";

		a[1][0] = "";
		a[1][1] = "";

		a[2][0] = "abc@gmail.com";
		a[2][1] = "Primo405$";

		return a;

	}

}
