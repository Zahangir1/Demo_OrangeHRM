package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class TestBaseClass {
    public static void main(String[] args) throws InterruptedException {
        //Open the Chrome Browser
        System.setProperty("webdriver.chrome.driver", "D://Dependencies//chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //Navigate to the URL
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        //Maximize the browser window
        driver.manage().window().maximize();
        Thread.sleep(3000);
        //Xpath Locator identifier
        driver.findElement(By.xpath("(//input)[2]")).sendKeys("Admin");
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//input)[3]")).sendKeys("admin123");
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//button)[1]")).click();
        Thread.sleep(5000);
        //Close the Browser
        driver.close();
        System.out.println("Browser open successfully");


    }

}
