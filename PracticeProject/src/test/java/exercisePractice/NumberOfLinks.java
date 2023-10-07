package exercisePractice;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import seleniumPractice.Setup;

public class NumberOfLinks extends Setup {

	@Test
	void noOfLinks() {

		String url = "https://flipkart.com";
		browser(url);

		WebElement cross = driver.findElement(By.xpath("//span[@class='_30XB9F' and @role='button']"));
		wait.until(ExpectedConditions.elementToBeClickable(cross));
		cross.click();

		List<WebElement> links = driver.findElements(By.tagName("a"));

		List<WebElement> images = driver.findElements(By.tagName("img"));

		links.addAll(images);

		System.out.println("Total Links = " + links.size());

		for (WebElement link : links) {

			String linkurl = link.getAttribute("href");
			System.out.println(linkurl + " and " + link.getText());

		}

		driver.quit();

	}

}
