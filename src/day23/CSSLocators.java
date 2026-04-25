package day23;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class CSSLocators {
	
	public static void main(String[] args) {
        
		WebDriver driver = null;
		// ensure chromedriver binary is available
		WebDriverManager.chromedriver().setup();
		try {
			driver = new ChromeDriver();
			driver.manage().window().maximize(); // maximize the browser window
			// a short implicit wait to allow elements to be found
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

			driver.get("https://demo.nopcommerce.com/");
		
		//tag id      tag#id
		//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T-shirts");
		//driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("T-shirts");
		
		//tag class   tag.classname
		//driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("T-shirts");
		//driver.findElement(By.cssSelector(".search-box-text")).sendKeys("T-shirts");
		
		
		//tag attribute   tag[attribute='value']
		//driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("T-Shirts");
		//driver.findElement(By.cssSelector("[placeholder='Search store']")).sendKeys("T-Shirts");
		
			//tag class attribute
			//driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("T-Shirts");
			// prefer selecting by id when available (more specific)
			driver.findElement(By.id("small-searchterms")).sendKeys("T-Shirts");

		} finally {
			// quit the browser even if something goes wrong
			if (driver != null) {
				driver.quit();
			}
		}

	}

}
