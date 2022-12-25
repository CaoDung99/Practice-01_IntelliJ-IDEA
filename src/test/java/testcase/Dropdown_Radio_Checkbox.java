package testcase;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import supports.WebUI;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class Dropdown_Radio_Checkbox {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.navigate().to("https://trytestingthis.netlify.app/");

        /*
        // Lấy 1 checkbox cụ thể, nếu có nhiều checkbox cùng id sẽ lấy từ trên xuống
        // Boolean checkbox = driver.findElement(By.id("moption")).isSelected();

        // Lấy ra danh sách checkbox
        List<WebElement> listCheckbox = driver.findElements(By.id("moption"));

        // Lấy ra từng vị trí từng checkbox theo thứ tự từ trên xuống dưới
        for(int i = 0; i <listCheckbox.size(); i++){
            boolean isCheckbox = listCheckbox.get(i).isSelected();
            if(isCheckbox == false){

                listCheckbox.get(2).click();
                System.out.println("Vị trí thứ" + (i + 1) + listCheckbox.get(i).isSelected());
            }
        }
        // lấy ra từng element cụ thể - dựa vào số lượng item của list
        for(int i =0; i < listCheckbox.size(); i++){
            WebElement itemCheckbox = driver.findElement(By.xpath("(//input[@id='moption'])["+ ( i + 1) + "]"));
            itemCheckbox.click();
            System.out.println("itemCheckbox.isSelected() = " + itemCheckbox.isSelected());

        }

         */
        // Lấy 1 radio cụ thể
        Boolean Radio = driver.findElement(By.name("gender")).isSelected();

        List<WebElement> listRadio = driver.findElements(By.name("gender"));

        // Lấy ra từng vị trí từng radio theo thứ tự từ trên xuống dưới
        for (int i = 0; i < listRadio.size(); i++) {

           listRadio.get(1).click();
        }

        // lấy ra từng element cụ thể - dựa vào số lượng item của list
        for(int i =0; i < listRadio.size(); i++){
            WebElement itemRadio = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/form[1]/fieldset[1]/input["+ (i + 3)+ "]"));
            itemRadio.click();
            System.out.println("itemCheckbox.isSelected() = " + itemRadio.getSize());

        }

    }

}
