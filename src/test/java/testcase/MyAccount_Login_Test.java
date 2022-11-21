package testcase;

import common.BaseTest;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.MyAccount_Login;

public class MyAccount_Login_Test extends BaseTest{

    MyAccount_Login login;

    @BeforeClass
    public void LoginTest(){
        login = new MyAccount_Login(driver);
    }

    @Test (priority = 1, description = "TC1_Dang nhap thanh cong")
    @Severity(SeverityLevel.CRITICAL)
    public void TC1_Login(){
        login.getURL("https://practice.automationtesting.in/my-account/");
        login.enterUsername("caotrandung99@gmail.com");
        login.enterPassword("caotrandung");
        login.ClickLogin();
        login.verifyLogin("Hello", "1");
        login.ClickLogout();
    }

    @Test (priority = 2, description = "TC2_Dang nhap sai username")
    public void TC2_Login(){
        login.getURL("https://practice.automationtesting.in/my-account/");
        login.enterUsername("....");
        login.enterPassword("caotrandung");
        login.ClickLogin();
        login.verifyLogin("Error", "2");

    }

    @Test (priority = 3, description = "TC3_Dang nhap sai password")
    public  void TC3_Login(){
        login.getURL("https://practice.automationtesting.in/my-account/");
        login.enterUsername("caotrandung99@gmail.com");
        login.enterPassword("....");
        login.ClickLogin();
        login.verifyLogin("Error", "3");
    }

    @Test (priority = 4, description = "TC4_ Dang nhap trong password")
    public  void TC4_Login(){
        login.getURL("https://practice.automationtesting.in/my-account/");
        login.enterUsername("caotrandung99@gmail.com");
        login.enterPassword("");
        login.ClickLogin();
        login.verifyLogin("Error: Password is required.", "4");
    }
}
