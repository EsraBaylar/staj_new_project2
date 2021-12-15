package tesNgPages;

import WebElements.SnapdealWebElements;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import utils.Driver;

import java.util.List;
import java.util.Set;

public class snapdealFunctionTest {
    SnapdealWebElements sn;
    WebDriver driver;


    @Test
    public void snapdealFunctionTest() throws InterruptedException {
      sn=new SnapdealWebElements();

        WebDriverWait wait=new WebDriverWait(Driver.getDriver(),30);
        driver= Driver.getDriver();
        driver.get("https://www.snapdeal.com/ ");
        driver.manage().window().maximize();

        sn.getAllow().click();
        String id1= driver.getWindowHandle();
        sn.getSearch().sendKeys("Casio Watch");
        sn.getSearchButton().click();

        int random=(int) (Math.random()* sn.getWatches().size());

        while (!sn.getWatches().get(random).isDisplayed()){
        JavascriptExecutor js= (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0,500)");}
        sn.getWatches().get(random).click();

        Set<String> ids=driver.getWindowHandles();
        for (String win: ids){
            if (!win.equals(id1)){
                driver.switchTo().window(win);
            }
        }

        wait.until(ExpectedConditions.elementToBeClickable(sn.getAllowAll()));
        sn.getAllowAll().click();

        Actions actions=new Actions(driver);
        Action action=actions.moveToElement(sn.getPicture(),0,0).build();
        action.perform();
        Thread.sleep(3000);
        action=actions.moveToElement(sn.getPicture(),90,90).build();
        action.perform();
        Thread.sleep(3000);
        action=actions.moveToElement(sn.getPicture(),-100,100).build();
        action.perform();









    }


}
