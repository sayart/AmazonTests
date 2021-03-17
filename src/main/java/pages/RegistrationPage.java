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

    public void clickCreateAccountButton(){
        createAccountButton.click();
    }

    public void verifyCodeFieldIsDisplayed(){
        verifyCodeField.isDisplayed();
    }

}
