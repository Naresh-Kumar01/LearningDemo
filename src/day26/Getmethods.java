package day26;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import java.util.Set;

public class Getmethods {

	public static void main(String[] args) throws InterruptedException {
		// Ensure Selenium browser driver is available on the classpath and chromedriver binary is available.
		WebDriver driver = new ChromeDriver();

		// get(url) - opens the url on the browser
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);

		// getTitle() - returns title of the page
		System.out.println(driver.getTitle());  // OrangeHRM

		// getCurrentUrl() - returns URL of the page
		System.out.println(driver.getCurrentUrl()); // https://opensource-demo.orangehrmlive.com/web/index.php/auth/login

		// getWindowHandles() - returns IDs of the multiple browser windows
		driver.findElement(By.linkText("OrangeHRM, Inc")).click(); // this will open a new browser window

		Set<String> windowids = driver.getWindowHandles();
		System.out.println(windowids);

		driver.quit();
	}

}
