package WebElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.util.List;

public class SnapdealWebElements {
    public SnapdealWebElements() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@name='keyword']")
    private WebElement search;

    @FindBy(xpath="//button[@id='pushAllow']")
    private WebElement allow;

    @FindBy(xpath="//button[@class='searchformButton col-xs-4 rippleGrey']//span")
    private WebElement searchButton;

    @FindBy(xpath="//section[@class='js-section clearfix dp-widget dp-fired']//div[@class='product-tuple-image ']")
    private List<WebElement> watches;

    @FindBy(id="adroll_allow_all")
    private WebElement allowAll;

    @FindBy(id = "bx-slider-left-image-panel")
    private WebElement picture;






    public WebElement getSearchButton() {
        return searchButton;
    }

    public WebElement getAllow() {
        return allow;
    }

    public WebElement getSearch() {
        return search;
    }

    public List<WebElement> getWatches() {
        return watches;
    }

    public WebElement getAllowAll() {
        return allowAll;
    }

    public WebElement getPicture() {
        return picture;
    }
}
