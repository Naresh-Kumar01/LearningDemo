package day37;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.LocalFileDetector; // Import zaroori hai
import org.openqa.selenium.remote.RemoteWebDriver;

public class FileUpload {
    public static void main(String[] args) throws MalformedURLException {
        
        URL gridUrl = new URL("http://localhost:4444");
        ChromeOptions options = new ChromeOptions();
        
        // WebDriver ko RemoteWebDriver class mein cast karke use karein taaki setFileDetector mil sake
        RemoteWebDriver driver = new RemoteWebDriver(gridUrl, options);
        
        // CRITICAL: Yeh line aapki local file ko Docker container mein transfer karegi
        driver.setFileDetector(new LocalFileDetector());
        
        try {
            driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
            driver.manage().window().maximize();
            
            // Multiple files ke absolute paths
            String file1 = "C:\\AutomationProjects\\SeleniumFramework\\Test1.txt";
            String file2 = "C:\\AutomationProjects\\SeleniumFramework\\Test2.txt";
            
            // SendKeys mein files ko "\n" se join karein
            driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(file1 + "\n" + file2);
            
            // Validation 1: Number of files
            List<WebElement> uploadedFiles = driver.findElements(By.xpath("//ul[@id='fileList']//li"));
            int noOfFilesUploaded = uploadedFiles.size();
            
            if(noOfFilesUploaded == 2) {
                System.out.println("Status: All Files are uploaded successfully.");
            } else {
                System.out.println("Status: Files are not uploaded. Count: " + noOfFilesUploaded);
            }
            
            // Validation 2: File names matching
            String fileName1 = uploadedFiles.get(0).getText();
            String fileName2 = uploadedFiles.get(1).getText();
            
            if(fileName1.equals("Test1.txt") && fileName2.equals("Test2.txt")) {
                System.out.println("Validation: File names matching correctly.");
            } else {
                System.out.println("Validation: File names mismatch!");
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Hamesha quit karein taaki Docker session release ho jaye
            driver.quit();
        }
    }
}