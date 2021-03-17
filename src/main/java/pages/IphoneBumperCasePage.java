package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IphoneBumperCasePage  extends BasePage{

    @FindBy(id = "add-to-cart-button")
    private WebElement addToCartButton;

    public IphoneBumperCasePage(WebDriver driver) {
        super(driver);
    }

    public void clickAddToCartButton() {
        addToCartButton.click();
    }



}
