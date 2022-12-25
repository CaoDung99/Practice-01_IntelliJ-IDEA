package testcase;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.time.Duration;
import java.util.List;

public class Elements {

    public static void main(String[] args) throws  InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

        /*
        driver.get("https://www.google.com");

        WebElement searchBox =  driver.findElement(By.name("q"));
        searchBox.sendKeys("automation step by step", Keys.ENTER);

        driver.navigate().to("https://trytestingthis.netlify.app/");
        List<WebElement> option = driver.findElements(By.name("Optionwithcheck[]"));

        for (WebElement element : option){
            System.out.println(element.getText());
        }

        driver.findElement(By.cssSelector("#fname")).sendKeys("Cao Trần Dũng");
        */
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
        WebElement loginbuton = driver.findElement(By.id("btnlogin"));

        driver.findElement(RelativeLocator.with(By.tagName("input")).above(loginbuton)).sendKeys("ABCD");

        Thread.sleep(2000);

        


        driver.close();
        driver.quit();
    }
}
