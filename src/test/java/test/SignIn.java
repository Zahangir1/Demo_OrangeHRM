package test;

import base.BaseClass;
import org.testng.annotations.Test;
import pom.loginPage.SignPage;

public class SignIn extends BaseClass {

    @Test
    public void signIn_test() throws InterruptedException {
        Thread.sleep(5000);
        SignPage sign = new SignPage(driver);
        /*sign.click_on_contactus();*/
        sign.set_your_username("Admin");
        Thread.sleep(2000);
        sign.set_your_password("admin123");
        Thread.sleep(2000);
        sign.click_on_submitBtn();
        Thread.sleep(5000);
        System.out.println("Successfully Login");



    }

}
