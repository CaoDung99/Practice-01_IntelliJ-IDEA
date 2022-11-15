package pages;

import common.BaseTest;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginPage extends  BaseTest{

    LoginPage loginPage;

    @BeforeClass
    public void LoginTest(){
        loginPage = new LoginPage(driver);
    }
}
