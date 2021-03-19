package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage {
    @FindBy(id = "ap_customer_name")
    private WebElement nameField;

    @FindBy(id = "ap_email")
    private WebElement emailField;

    @FindBy(id = "ap_password")
    private WebElement passwordField;

    @FindBy(id = "ap_password_check")
    private WebElement checkPasswordField;

    @FindBy(id = "continue")
    private WebElement createAccountButton;

    @FindBy(xpath = "//input[@name='code'][contains(@class, cvf-widget-input-code)]")
    private WebElement verifyCodeField;

    @FindBy(xpath = "//span[@class='a-list-item'][contains(text(), 'not include the characters')]")
    private WebElement errorMessageWrongName;

    @FindBy(xpath = "//div[@class='a-alert-content'][contains(text(), 'Enter a valid email')]")
    private WebElement errorMessageWrongEmail;

    @FindBy(xpath = "//div[@class='a-alert-content'][contains(text(), 'Enter your name')]")
    private WebElement allertMessageEnterYourName;

    @FindBy(xpath = "//div[@class='a-alert-content'][contains(text(), 'Enter your email')]")
    private WebElement allertMessageEnterYourEmail;

    @FindBy(xpath = "//div[@class='a-alert-content'][contains(text(), 'Enter your password')]")
    private WebElement allertMessageEnterYourPassword;

    @FindBy(xpath = "//div[@id='auth-password-invalid-password-alert']//div[@class='a-alert-content'][contains(text(), 'at least 6 characters')]")
    private WebElement allertMessageWrongPassword;

    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    public void enterNameToNameField(final String customerNameText) {
        nameField.clear();
        nameField.sendKeys(customerNameText);
    }

    public void enterEmailToEmailField(final String emailText) {
        emailField.clear();
        emailField.sendKeys(emailText);
    }

    public void enterPasswordToPasswordField(final String password) {
        passwordField.clear();
        passwordField.sendKeys(password);
    }

    public void enterPasswordToCheckPasswordField(final String password) {
        checkPasswordField.clear();
        checkPasswordField.sendKeys(password);
    }

    public void clickCreateAccountButton() {
        createAccountButton.click();
    }

    public boolean verifyCodeFieldIsDisplayed() {
        return verifyCodeField.isDisplayed();
    }

    public boolean verifyErrorMessageWrongNameVisible() {
        return errorMessageWrongName.isDisplayed();
    }

    public boolean verifyErrorMessageEnterValidEmailVisible() {
        return errorMessageWrongEmail.isDisplayed();
    }

    public boolean verifyAlertMessageEnterYourNameVisible() {
        return allertMessageEnterYourName.isDisplayed();
    }

    public boolean verifyAlertMessageEnterYourEmailVisible() {
        return allertMessageEnterYourEmail.isDisplayed();
    }

    public boolean verifyAlertMessageEnterYourPasswordVisible() {
        return allertMessageEnterYourPassword.isDisplayed();
    }

    public boolean verifyAllertMessageWrongPasswordVisible() {
        return allertMessageWrongPassword.isDisplayed();
    }


}
