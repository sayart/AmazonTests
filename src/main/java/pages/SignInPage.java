package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends BasePage{

    @FindBy(id = "ap_email")
    private WebElement emailField;

    public SignInPage(WebDriver driver) {
        super(driver);
    }
}
