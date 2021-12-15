package tesNgPages;

import WebElements.IkeaWebElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import utils.Driver;

import java.util.List;

public class IkeaFunctionTest {
    IkeaWebElements ik;
    WebDriver driver;

    @Test
    public void ikeaFunction() throws InterruptedException {

        ik = new IkeaWebElements();


        driver = Driver.getDriver();
        driver.get("https://www.ikea.com");
        driver.manage().window().maximize();

        ik.getCookies().click();
        ik.getSearchButton().click();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 30);
        wait.until(ExpectedConditions.elementToBeClickable(ik.getIkeaEllenica()));
        ik.getIkeaEllenica().click();
        wait.until(ExpectedConditions.elementToBeClickable(ik.getGoTo()));
        ik.getGoTo().click();
        driver.navigate().back();


        ik.getSearchButton().click();
        wait.until(ExpectedConditions.elementToBeClickable(ik.getIkeaEnglish()));
        ik.getIkeaEnglish().click();
        wait.until(ExpectedConditions.elementToBeClickable(ik.getGoTo()));
        ik.getGoTo().click();
        driver.navigate().back();


    }
}