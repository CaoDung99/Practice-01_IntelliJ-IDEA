package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import supports.WebUI;

public class MyAccount_Registration_Page {

    private WebDriver driver;

    private WebUI webUI;

    public MyAccount_Registration_Page (WebDriver _driver){
        driver = _driver;
        webUI = new WebUI(driver);
    }

    By emailTxt = By.id("reg_email");

    By passwordTxt = By.id("reg_password");

    By registerBtn = By.xpath("//input[@name='register']");

    By verifyRegested_Sucsessfull = By.xpath("//p[contains(text(),'Hello')]");

    By verifyRegested_Error = By.xpath("//div[@id='body']//li[1]");
    By logoutBtn = By.xpath("//input[@name='register']");

    public void getURL(String url){
        driver.get(url);
        webUI.waitForPageLoaded();
    }

    public void enterEmail(String email){
        webUI.setText(emailTxt, email);
    }

    public void enterPassword(String password){
        webUI.setText(passwordTxt, password);
    }

    public void ClickRegisted(){
        webUI.clickElement(registerBtn);
    }

    public void ClickLogout(){
        webUI.clickElement(logoutBtn);
    }

    public void verifyRegited( String msg, String option){
        switch (option){
            case "1": //happy case
                Assert.assertEquals(webUI.getElement(verifyRegested_Sucsessfull).getText().trim().substring(0,5), msg.trim());
                break;
            case "2": // invalid email
                Assert.assertEquals(webUI.getElement(verifyRegested_Error).getText().trim().substring(0,44), msg.trim());
                break;
            case "3": // empty email
                Assert.assertEquals(webUI.getElement(verifyRegested_Error).getText().trim().substring(0,44), msg.trim());
                break;
            case "4": // empty password
                driver.findElement(By.id("elementID")).isEnabled();
            case "5": // empty email and password
                Assert.assertEquals(webUI.getElement(verifyRegested_Error).getText().trim().substring(0,40), msg.trim());
                break;
        }
    }
}
