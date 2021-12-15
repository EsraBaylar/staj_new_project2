package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.util.List;

public class IkeaWebElements {
    public IkeaWebElements() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "onetrust-accept-btn-handler")
    private WebElement cookies;

    @FindBy(xpath = "//span[@class='selected-site svelte-xiw4pw']/span")
    private WebElement searchButton;

    @FindBy(xpath = "(//h2[@class='pub__card__title'])[22]")
    private WebElement desingYourDesk;

    @FindBy(xpath= "//input[@id='search-sites']")
    private WebElement search;

    @FindBy(xpath= "//ul[@class='svelte-xiw4pw']//button[@class='option svelte-xiw4pw']")
    private List<WebElement> ikeaLanguage;

    @FindBy(css= "a[data-cy='go-to-website']")
    private WebElement goTo;

    @FindBy(xpath= "//button[@class='option svelte-xiw4pw']")
    private WebElement ikeaEllenica;

    @FindBy(xpath= "(//button[@class='option svelte-xiw4pw'])[2]")
    private WebElement ikeaEnglish;


    @FindBy(xpath= "//div[@class='menu-icon']//i")
    private WebElement dimensions;

    @FindBy(xpath= "(//div[@class='menu-icon'])[2]")
    private WebElement legsTrestles;

    @FindBy(xpath= "//i[@class='byox-icon byox-icon-bottom byox-icon-right']")
    private WebElement slipMenu;



    @FindBy(xpath= "//div[@class='menu-selector active']//li")
    private List<WebElement> legTres;








    public WebElement getCookies() {
        return cookies;
    }

    public WebElement getDesingYourDesk() {
        return desingYourDesk;
    }

    public WebElement getSearchButton() {
        return searchButton;
    }

    public WebElement getSearch() {
        return search;
    }

    public List<WebElement> getIkeaLanguage() {
        return ikeaLanguage;
    }

    public WebElement getGoTo() {
        return goTo;
    }

    public WebElement getIkeaEllenica() {
        return ikeaEllenica;
    }

    public WebElement getIkeaEnglish() {
        return ikeaEnglish;
    }

    public WebElement getDimensions() {
        return dimensions;
    }

    public WebElement getLegsTrestles() {
        return legsTrestles;
    }

    public WebElement getSlipMenu() {
        return slipMenu;
    }

    public List<WebElement> getLegTres() {
        return legTres;
    }
}

