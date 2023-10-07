package seleniumPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Amazon {

	@Test
	void amazon() throws Exception {

		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		String url = "https://www.amazon.in/";

		driver.get(url);

		Thread.sleep(10);

		String item = "Camera";

		WebElement searchItem = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		wait.until(ExpectedConditions.elementToBeClickable(searchItem));
		searchItem.sendKeys(item);

		WebElement searchButton = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		wait.until(ExpectedConditions.elementToBeClickable(searchButton));
		searchButton.click();

		List<WebElement> itemList = driver
				.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		int listSize = itemList.size();
		System.out.println(listSize);

		List<WebElement> itemPriceList = driver.findElements(By.xpath("//span[@class='a-price-whole']"));

		for (int i = 0; i < listSize; i++) {

			String itemname = itemList.get(i).getText();

			String itemPrice = itemPriceList.get(i).getText();

			System.out.println(i + ": " + itemname + " : " + itemPrice + " only ");
			System.out.println("");

		}

		driver.quit();

	}

}
