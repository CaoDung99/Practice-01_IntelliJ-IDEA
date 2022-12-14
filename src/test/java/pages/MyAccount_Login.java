package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import supports.WebUI;

public class MyAccount_Login {

    private WebDriver driver;

    private  WebUI webUI;

    public MyAccount_Login(WebDriver _driver){
        driver = _driver;
        webUI = new WebUI(driver);
    }

    By usernameTxt = By.id("username");

    By passwordTxt = By.id("password");

    By loginBtn = By.xpath("//input[@name='login']");

    By verifyLogin_Sucsessfull = By.xpath("//p[contains(text(),'Hello')]");

    By verifyLogin_Error = By.xpath("//strong[normalize-space()='Error:']");

    By logoutBtn = By.xpath("//a[normalize-space()='Sign out']");

    public void getURL(String url){
        driver.get(url);
        webUI.waitForPageLoaded();
    }

    public void enterUsername(String username){
        webUI.setText(usernameTxt, username);
    }

    public void enterPassword(String password){
        webUI.setText(passwordTxt, password);
    }

    public void ClickLogin(){
        webUI.clickElement(loginBtn);
    }

    public void ClickLogout(){
        webUI.clickElement(logoutBtn);
    }

    public void verifyLogin(String msg, String option){
        switch (option){
            case "1": //happy case
                Assert.assertEquals(webUI.getElement(verifyLogin_Sucsessfull).getText().trim().substring(0,5), msg.trim());
                break;
            case "2": //invalid username
                Assert.assertEquals(webUI.getElement(verifyLogin_Error).getText().substring(0,5), msg.trim());
                break;
            case "3": //invalid password
                Assert.assertEquals(webUI.getElement(verifyLogin_Error).getText().substring(0,5), msg.trim());
                break;
            case "4": // empty password
                Assert.assertEquals(webUI.getElement(verifyLogin_Error).getText().substring(0,5), msg.trim());
            default: //blank
                Assert.assertEquals(webUI.getElement(verifyLogin_Sucsessfull).getText().substring(0,30), msg.trim());
                break;
        }
    }
}
