package others;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.apache.http.HttpConnection;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UrlAuthentication {

	@Test
	void checkUrl() throws Exception {

		WebDriver driver = new ChromeDriver();
		String name = "https://naveenautomationlabs.com/opencart/";

		driver.get(name);

		List<WebElement> urllist = driver.findElements(By.tagName("a"));
		System.out.println(urllist.size());

		for (int i = 0; i < urllist.size(); i++) {

			WebElement ele = urllist.get(i);

			String eleText = ele.getAttribute("href");

			// System.out.println(eleText);

			URL url = new URL(eleText);

			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("HEAD");
			int respCode = conn.getResponseCode();
			System.out.println(eleText + " = " + respCode);

		}

	}

}
