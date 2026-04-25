package day26;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Conditionalmethod {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/register");
        driver.manage().window().maximize();

        WebElement male_rd = driver.findElement(By.xpath("//input[@id='gender-male']"));
        WebElement female_rd = driver.findElement(By.xpath("//input[@id='gender-female']"));

        System.out.println("Before selection...............");
        System.out.println(male_rd.isSelected());   // false
        System.out.println(female_rd.isSelected()); // false

        System.out.println("After selecting male...");
        male_rd.click();
        System.out.println(male_rd.isSelected());   // true
        System.out.println(female_rd.isSelected()); // false

        System.out.println("After selecting female...");
        female_rd.click();
        System.out.println(male_rd.isSelected());   // false
        System.out.println(female_rd.isSelected()); // true

        boolean newsletterstatus = driver.findElement(By.xpath("//input[@id='Newsletter']")).isSelected();
        System.out.println("Newsletter checkbox status: " + newsletterstatus); // true
    }
}