package seleniumPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class iPhoneClass {

	@Test
	void iphone() {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");

		WebElement ele = driver.findElement(By.xpath("//div[@id='nav-xshop']//a[text()='Mobiles']//following-sibling::a[starts-with(text(),'F')]//parent::div//a[text()='Sell']"));
		ele.click();
		
		
		/*WebElement searchField = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchField.click();
		searchField.clear();
		searchField.sendKeys("iphone 1");

		List<WebElement> list = driver
				.findElements(By.xpath("//div[starts-with(@class,'s-suggestion') and @aria-label]"));

		Actions actions = new Actions(driver);

		for (int i = 0; i < list.size(); i++) {
			WebElement ele = list.get(i);
			String s = ele.getText();

			if (s.equalsIgnoreCase("iphone 12")) {

				actions.moveToElement(ele).click().build().perform();
				break;

			}*/

		}

}


