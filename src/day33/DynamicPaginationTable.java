package day33;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicPaginationTable {

	public static void main(String[] args) throws InterruptedException {
		
		// Use ChromeOptions for more predictable startup and create an explicit wait
		ChromeOptions options = new ChromeOptions();
		// allow connections when chrome/chromedriver negotiation requires it (works around some env issues)
		options.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(options);
		// keep implicit wait short and rely on explicit waits for specific elements
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		driver.get("https://demo.opencart.com/admin/index.php");
		driver.manage().window().maximize();
		
		
		// Wait specifically for the username and password fields to be visible
		WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("input-username")));
		username.clear();
		username.sendKeys("demo");

		WebElement password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("input-password")));
		password.clear();
		password.sendKeys("demo");

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Login']"))).click();
		
				
		
		// close any optional startup popup safely (if present)
		try {
			WebElement closeBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='btn-close']")));
			if (closeBtn.isDisplayed()) {
				closeBtn.click();
			}
		} catch (Exception e) {
			// popup not present - continue
		}
		
		
		driver.findElement(By.xpath("//a[@class='parent collapsed'][normalize-space()='Customers']")).click();  //customers main memu
		driver.findElement(By.xpath("//ul[@id='collapse-5']//a[contains(text(),'Customers')]")).click(); //customers sub menu
		
		//Showing 1 to 10 of 19081 (1909 Pages)
		String text=driver.findElement(By.xpath("//div[contains(text(),'Pages')]")).getText();
		
		int total_pages=Integer.parseInt(text.substring(text.indexOf("(")+1,text.indexOf("Pages")-1));
		
		
		//repeating pages
		for(int p=1;p<=3;p++)
		{
			
			if(p>1)
			{
				WebElement active_page=driver.findElement(By.xpath("//ul[@class='pagination']//*[text()="+p+"]"));
				active_page.click();
				Thread.sleep(3000);
			}
			
			//reading data from the page
					
			int noOfRows=driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr")).size();
			
			for(int r=1;r<=noOfRows;r++)
			{
				String customerName=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]/td[2]")).getText();
				String email=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]/td[3]")).getText();
				String status=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]/td[5]")).getText();
				
				System.out.println(customerName+"\t"+email+"\t"+status);
				
			}

		}
	}
}
