package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import supports.WebUI;



import java.util.List;

public class TryTestingPage {
    private WebDriver driver;
    private WebUI webUI;

    public TryTestingPage(WebDriver _dirver){
        driver = _dirver;
        webUI = new WebUI(driver);
    }



}
