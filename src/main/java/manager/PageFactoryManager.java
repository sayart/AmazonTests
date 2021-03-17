package manager;

import org.openqa.selenium.WebDriver;
import pages.*;


public class PageFactoryManager {

    WebDriver driver;

    public PageFactoryManager(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage getHomePage() {
        return new HomePage(driver);
    }

    public IphoneBumperCasePage getShoppingCartPage() {
        return new IphoneBumperCasePage(driver);
    }

    public RegistrationPage getSearchResultsPage() {
        return new RegistrationPage(driver);
    }

    public SearchResultPage getProductPage() {
        return new SearchResultPage(driver);
    }

    public SignInPage getCheckoutPage() {
        return new SignInPage(driver);
    }
}