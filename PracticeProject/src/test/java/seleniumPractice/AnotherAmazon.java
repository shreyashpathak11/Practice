package seleniumPractice;

import java.sql.Driver;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class AnotherAmazon extends Setup {

	@Test
	void amazonTest() throws Exception {

		String url = "https://www.amazon.in/";

		browser(url);

		Thread.sleep(10);

		WebElement category = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		// wait.until(ExpectedConditions.elementToBeClickable(category));
		// category.click();
		Select select = new Select(category);

		select.selectByVisibleText("Alexa Skills");
		select.selectByVisibleText("All Categories");

		WebElement camera = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		wait.until(ExpectedConditions.elementToBeClickable(camera));
		camera.click();
		camera.sendKeys("Camera");

		WebElement searchButton = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		wait.until(ExpectedConditions.elementToBeClickable(searchButton));
		searchButton.click();

		List<WebElement> itemName = driver
				.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		int itemSize = itemName.size();

		List<WebElement> itemPrice = driver.findElements(By.xpath("//span[@class='a-price-whole']"));

		for (int i = 0; i < itemSize; i++) {

			String name = itemName.get(i).getText();
			String price = itemPrice.get(i).getText();

			System.out.println(name + " = " + price);
			System.out.println("");

		}

		System.out.println("\n\n\n");

		List<String> newList = itemName.stream().map(s -> s.getText()).sorted().collect(Collectors.toList());

		newList.size();

		for (int i = 0; i < newList.size(); i++) {

			System.out.println(newList.get(i));

		}

		driver.quit();

	}

}
