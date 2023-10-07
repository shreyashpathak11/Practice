package seleniumPractice;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.apache.poi.sl.draw.geom.AdjustPointIf;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrokenLinks {

	@Test
	void brokenLinks() throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://omayo.blogspot.com/2013/05/page-one.html");

		List<WebElement> list = driver.findElements(By.tagName("a"));

		for (int i = 0; i < list.size(); i++) {

			WebElement element = list.get(i);
			String urlString = element.getAttribute("href");
			URL url = new URL(urlString);

			HttpURLConnection http = (HttpURLConnection) url.openConnection();
			http.setRequestMethod("HEAD"
					+ ""
					+ "");
			int responseCode = http.getResponseCode();

			if (responseCode >= 400) {
				System.out.println(urlString + " is broken");
			} else {
				System.out.println(urlString + " is a proper link ");
			}

		}

	}

}
