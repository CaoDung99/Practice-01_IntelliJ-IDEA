package testcase;

import common.BaseTest;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.MyAccount_Registration_Page;

public class MyAccount_Registration_Test extends BaseTest{
    MyAccount_Registration_Page registrationPage;

    @BeforeClass
    public void MyAccount_Registration_Test(){
        registrationPage = new MyAccount_Registration_Page(driver);
    }

    @Test (priority = 1, description = "TC1_Dang ky thanh cong")
    @Severity(SeverityLevel.CRITICAL)
    public void TC1_Registed(){
        registrationPage.getURL("https://practice.automationtesting.in/my-account");
        registrationPage.enterEmail("pi.no.and.pi.pun.4@gmail.com");
        registrationPage.enterPassword("SuperSecretPassword!");
        registrationPage.ClickRegisted();
        registrationPage.verifyRegited("Hello", "1");
    }

    @Test (priority = 2, description = "TC2_Dang ky email khong hop le")
    @Severity(SeverityLevel.CRITICAL)
    public void TC2_Registed(){
        registrationPage.getURL("https://practice.automationtesting.in/my-account");
        registrationPage.enterEmail("pi.no.and.pi.pun.4@gmail");
        registrationPage.enterPassword("SuperSecretPassword!");
        registrationPage.ClickRegisted();
        registrationPage.verifyRegited("Error: Please provide a valid email address.", "2");
    }

    @Test (priority = 3, description = "TC_Dang ky email bi trong")
    public void TC3_Registed(){
        registrationPage.getURL("https://practice.automationtesting.in/my-account");
        registrationPage.enterEmail("");
        registrationPage.enterPassword("SuperSecretPassword!");
        registrationPage.ClickRegisted();
        registrationPage.verifyRegited("Error: Please provide a valid email address.", "3");
    }

    @Test (priority = 4, description = "TC4_Dang ky password bi trong")
    public void TC4_Registed(){
        registrationPage.getURL("https://practice.automationtesting.in/my-account");
        registrationPage.enterEmail("pi.no.and.pi.pun.4@gmail.com");
        registrationPage.enterPassword("");
        registrationPage.ClickRegisted();

    }
}

