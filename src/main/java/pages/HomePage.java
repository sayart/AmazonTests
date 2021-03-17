package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    @FindBy(id = "nav-belt")
    private WebElement header;

    @FindBy(id = "navFooter")
    private WebElement footer;

    @FindBy(id = "nav-cart-count-container")
    private WebElement cartIcon;

    @FindBy(id = "nav-cart-count")
    private WebElement cartCount;

    @FindBy(id = "icp-nav-flyout")
    private WebElement languageButton;

    @FindBy(id = "nav-link-accountList")
    private WebElement signInButton;

    @FindBy(id = "nav-logo")
    private WebElement storeButton;

    @FindBy(id = "twotabsearchtextbox")
    private WebElement searchField;

    @FindBy(id = "nav-search-submit-button")
    private WebElement searchButton;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void openHomePage(String url) {
        driver.get(url);
    }

    public void isHeaderVisible() {
        header.isDisplayed();
    }

    public void isFooterVisible() {
        footer.isDisplayed();
    }

    public void isCartIconVisible() {
        cartIcon.isDisplayed();
    }

    public void isLanguageButtonVisible() {
        languageButton.isDisplayed();
    }

    public void isSignInButtonVisible() {
        signInButton.isDisplayed();
    }

    public void clickSignInButton() {
        signInButton.click();
    }

    public void clickStoreButton() {
        storeButton.click();
    }

    public void isSearchFieldVisible() {
        searchField.isDisplayed();
    }

    public void clickCartButton() {
        cartIcon.click();
    }

    public void enterTextToSearchField(final String searchText) {
        searchField.clear();
        searchField.sendKeys(searchText);
    }

    public void clickSearchButton() {
        searchButton.click();
    }

    public String actualProductCountInCart() {
        return cartCount.getText();
    }


}
