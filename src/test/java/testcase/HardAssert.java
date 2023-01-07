package testcase;

import common.BaseTest;
import common.BaseTest;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class HardAssert extends BaseTest {
    @Test(priority = 1)
    public void RunTest() {

        driver.get("https://anhtester.com");

        String expectedTitle = "Anh Tester";
        String originalTitle = driver.getTitle();

        System.out.println("*** Checking For The Title ***");

        Assert.assertEquals(originalTitle, expectedTitle);
    }
}


