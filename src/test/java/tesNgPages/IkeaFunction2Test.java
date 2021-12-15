package tesNgPages;

import WebElements.IkeaWebElements;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import utils.Driver;

import java.util.List;

public class IkeaFunction2Test {
    IkeaWebElements ik;
    WebDriver driver;
    @Test
    public void IkeaFunction2Test() throws InterruptedException {
        ik=new IkeaWebElements();


        driver= Driver.getDriver();
        driver.get("https://www.ikea.com/us/en/planners/");
        driver.manage().window().maximize();

        ik.getCookies().click();


        JavascriptExecutor js= (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView();", ik.getDesingYourDesk());

        ik.getDesingYourDesk().click();

        Thread.sleep(20);
        driver.switchTo().frame(1);

       WebDriverWait  wait=new WebDriverWait(driver,15);
       wait.until(ExpectedConditions.elementToBeClickable(ik.getDimensions()));
        ik.getDimensions().click();

        ik.getLegsTrestles().click();

        int random=(int)(Math.random()* ik.getLegTres().size());
        ik.getLegTres().get(random).click();



        ik.getSlipMenu();








    }
}
