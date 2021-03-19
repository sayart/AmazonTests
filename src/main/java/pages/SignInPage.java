package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends BasePage {

    @FindBy(id = "ap_email")
    private WebElement emailField;

    @FindBy(id = "ap_password")
    private WebElement passwordField;

    @FindBy(id = "continue")
    private WebElement continueButton;

    @FindBy(id = "signInSubmit")
    private WebElement signInButton;

    @FindBy(xpath = "//h4[@class='a-alert-heading'][contains(text(), 'There was a problem')]")
    private WebElement errorMessage;

    @FindBy(xpath = "//span[@class='a-list-item'][contains(text(), 'Your password is incorrect')]")
    private WebElement errorMessageWrongPassword;

    @FindBy(id = "createAccountSubmit")
    private WebElement createAmazonAccount;

    public SignInPage(WebDriver driver) {
        super(driver);
    }

    public void enterEmailToEmailField(final String emailText) {
        emailField.clear();
        emailField.sendKeys(emailText);
    }

    public void enterPasswordToPasswordField(final String password) {
        passwordField.clear();
        passwordField.sendKeys(password);
    }

    public void clickContinueButton() {
        continueButton.click();
    }

    public void clickSignInButton() {
        signInButton.click();
    }

    public boolean errorMessageVisible() {
        return errorMessage.isDisplayed();
    }

    public boolean errorMessageVisibleWrongPassword() {
        return errorMessageWrongPassword.isDisplayed();
    }

    public void clickCreateAmazonAccount() {
        createAmazonAccount.click();
    }


}
