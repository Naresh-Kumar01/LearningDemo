package day46;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class OrangeHRM {

    @BeforeClass
    public void setup() {
        System.out.println("Browser Open");
    }

    @Test
    public void loginTest() {
        System.out.println("Login Done");
    }

    @AfterClass
    public void tearDown() {
        System.out.println("Browser Close");
    }
}