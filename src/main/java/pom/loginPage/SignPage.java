package pom.loginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignPage {
   WebDriver driver = null;

    public SignPage(WebDriver driver) {
        this.driver = driver;
    }

    /*By contactus  = By.xpath("//*[ text() = 'Contact Us']");

    public void click_on_contactus(){
        driver.findElement(contactus).click();
    }*/

    By username = By.xpath("(//input)[2]");
    By password = By.xpath("(//input)[3]");
    By submitBtn = By.xpath("(//button)[1]");

    public void set_your_username(String u_name){
        driver.findElement(username).sendKeys(u_name);
    }

    public void set_your_password(String pass){
        driver.findElement(password).sendKeys(pass);
    }

    public void click_on_submitBtn(){
        driver.findElement(submitBtn).click();
    }


}
