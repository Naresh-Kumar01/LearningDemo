package day28;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import java.util.Set;

public class Assignment {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup(); // ✅ Yeh add karo
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
     //   driver.findElement(By.xpath("//a[text()='Home']")).click();
        
        driver.findElement(By.xpath("//a[text()='Udemy Courses']")).click();
        Set windowids=driver.getWindowHandles();
        System.out.println(windowids);
        driver.findElement(By.xpath("//a[text()='Free Courses on YouTube']")).click();
        Set windowids1=driver.getWindowHandles();
        System.out.println(windowids1);
        driver.close();
        
        
        // baaki code same rahega...
    }
}