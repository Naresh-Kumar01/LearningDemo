package day27;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class Explicitwaitcommand {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        // Explicit wait declaration
        WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();

        // Usage of explicit wait
        WebElement textusername = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
        textusername.sendKeys("Admin");

        WebElement textpwd = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Password']")));
        textpwd.sendKeys("admin123");

        WebElement loginButton = mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Login']")));
        loginButton.click();

    }
}








