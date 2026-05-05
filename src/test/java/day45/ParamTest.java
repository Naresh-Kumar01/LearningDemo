package day45;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamTest {

	WebDriver driver;
	
	
	@BeforeClass
	@Parameters({"browser","url"})
	void setup(String br,String url) throws InterruptedException
	{
		switch(br.toLowerCase())
		{
							case "chrome": 
								String chromeDriverPath = System.getProperty("webdriver.chrome.driver");
								if (chromeDriverPath != null && !chromeDriverPath.isEmpty()) {
									// Use provided chromedriver executable
									System.setProperty("webdriver.chrome.driver", chromeDriverPath);
									driver = new ChromeDriver();
								} else {
									WebDriverManager.chromedriver().setup();
									driver = new ChromeDriver();
								}
								break;
		case "edge" : 
				String edgeDriverPath = System.getProperty("webdriver.edge.driver");
				if (edgeDriverPath != null && !edgeDriverPath.isEmpty()) {
					System.setProperty("webdriver.edge.driver", edgeDriverPath);
					driver = new EdgeDriver();
				} else {
					// Attempt to download/setup edgedriver. If network is blocked this will fail.
					WebDriverManager.edgedriver().setup();
					driver = new EdgeDriver();
				}
				break;
		case "firefox" : 
				String firefoxBinary = System.getProperty("webdriver.firefox.bin");
				String geckoDriverPath = System.getProperty("webdriver.gecko.driver");
				// If geckodriver path provided use it, else attempt to setup via WebDriverManager
				if (geckoDriverPath != null && !geckoDriverPath.isEmpty()) {
					System.setProperty("webdriver.gecko.driver", geckoDriverPath);
				} else {
					WebDriverManager.firefoxdriver().setup();
				}
				// Set firefox binary location if provided (useful if Firefox isn't in default location)
				org.openqa.selenium.firefox.FirefoxOptions fo = new org.openqa.selenium.firefox.FirefoxOptions();
				if (firefoxBinary != null && !firefoxBinary.isEmpty()) {
					fo.setBinary(firefoxBinary);
				}
				try {
					driver = new FirefoxDriver(fo);
				} catch (org.openqa.selenium.SessionNotCreatedException e) {
					// Provide clear message and skip the tests for firefox if browser binary is missing
					throw new SkipException("Firefox not available or could not start: " + e.getMessage());
				}
				break;
		default: System.out.println("Invalid browser");return;
		}
				
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}
	
	@Test(priority=1)
	void testLogo()
	{
		boolean status=driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		Assert.assertEquals(status, true);
	}
	
	@Test(priority=2)
	void testTitle()
	{
		Assert.assertEquals(driver.getTitle(),"OrangeHRM");
	}
	
	@Test(priority=3)
	void testURL()
	{
		Assert.assertEquals(driver.getCurrentUrl(),"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@AfterClass
	void tearDown()
	{
		driver.quit();
	}

}
