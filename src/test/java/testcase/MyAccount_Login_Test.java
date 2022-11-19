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
        
        login.ClickLogout();
    }

}
