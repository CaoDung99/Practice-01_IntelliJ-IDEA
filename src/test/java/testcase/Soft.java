package testcase;

import common.BaseTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class Soft extends BaseTest {
    @Test(priority = 1)
    public void RunTest() {

        driver.get("https://anhtester.com");

        SoftAssert softassert = new SoftAssert();

        String expectedTitle = "Anh Tester";
        String originalTitle = driver.getTitle();

        System.out.println("*** Checking For The First Title ***");

        softassert.assertEquals(originalTitle, expectedTitle);

        System.out.println("*** Checking For The Second Title ***");

        softassert.assertEquals(originalTitle, "Anh Tester - Automation Testing");

        softassert.assertAll();
    }
}
