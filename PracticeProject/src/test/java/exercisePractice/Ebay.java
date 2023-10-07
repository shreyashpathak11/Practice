package exercisePractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import seleniumPractice.Setup;

public class Ebay extends Setup {

	String url = "https://www.ebay.com/";

	@Test(priority = 1)
	void allProducts() {

		browser(url);

		WebElement category = driver.findElement(By.xpath("//button[@id='gh-shop-a']"));
		wait.until(ExpectedConditions.elementToBeClickable(category));
		category.click();

		List<WebElement> electronics = driver.findElements(By.xpath("//h3//a"));

		for (WebElement electronic : electronics) {

			if (electronic.getAttribute("title").contains("electronics")) {

				electronic.click();
				break;

			}

		}

		WebElement searchField = driver.findElement(By.xpath("//input[@id='gh-ac']"));
		wait.until(ExpectedConditions.elementToBeClickable(searchField));
		searchField.click();
		searchField.sendKeys("Apple Watches");

		WebElement searchButton = driver.findElement(By.xpath("//input[@id='gh-btn']"));
		searchButton.submit();

	}

	@Test(priority = 2)
	void totalItems() {

		List<WebElement> result = driver.findElements(By.xpath("//div[@class='s-item__title']//span[@role='heading']"));
		int resultSize = result.size();
		System.out.println(resultSize);

	}

	@Test(priority = 3)
	void nthProduct() {

		List<WebElement> result = driver.findElements(By.xpath("//div[@class='s-item__title']//span[@role='heading']"));
		int resultSize = result.size();
		System.out.println(resultSize);

		for (int i = 0; i < resultSize; i++) {

			String nth = result.get(resultSize - 1).getText();
			System.out.println(nth);
			break;

		}

	}

	@Test(priority = 4)
	void firstPageProducts() {

		List<WebElement> result = driver.findElements(By.xpath("//div[@class='s-item__title']//span[@role='heading']"));

		for (int i = 0; i < result.size(); i++) {

			String firstPage = result.get(i).getText();
			System.out.println(i + " " + firstPage);

		}

	}

}
