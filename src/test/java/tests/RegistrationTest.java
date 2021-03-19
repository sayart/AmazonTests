package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationTest extends BaseTest {
    private String VALID_USER_NAME = "Abcde";
    private String INVALID_USER_NAME = "Abcde^";
    private String VALID_USER_EMAIL = "Abcasddeewq@gmail.com";
    private String INVALID_USER_EMAIL = "Abcasddeewqgmail.com";
    private String VALID_PASSWORD = "123456";
    private String INVALID_PASSWORD = "12345";

    @Test(priority = 1)
    public void checkRegistrationFormWithValidData() {
        getHomePage().clickSignInButton();
        getSignInPage().clickCreateAmazonAccount();
        getRegistrationPage().enterNameToNameField(VALID_USER_NAME);
        getRegistrationPage().enterEmailToEmailField(VALID_USER_EMAIL);
        getRegistrationPage().enterPasswordToPasswordField(VALID_PASSWORD);
        getRegistrationPage().enterPasswordToCheckPasswordField(VALID_PASSWORD);
        getRegistrationPage().clickCreateAccountButton();
        Assert.assertTrue(getRegistrationPage().verifyCodeFieldIsDisplayed());
    }

    @Test
    public void checkRegistrationWithInvalidName() {
        getHomePage().clickSignInButton();
        getSignInPage().clickCreateAmazonAccount();
        getRegistrationPage().enterNameToNameField(INVALID_USER_NAME);
        getRegistrationPage().enterEmailToEmailField(VALID_USER_EMAIL);
        getRegistrationPage().enterPasswordToPasswordField(VALID_PASSWORD);
        getRegistrationPage().enterPasswordToCheckPasswordField(VALID_PASSWORD);
        getRegistrationPage().clickCreateAccountButton();
        Assert.assertTrue(getRegistrationPage().verifyErrorMessageWrongNameVisible());
    }

    @Test
    public void checkRegistrationWithInvalidEmail() {
        getHomePage().clickSignInButton();
        getSignInPage().clickCreateAmazonAccount();
        getRegistrationPage().enterNameToNameField(VALID_USER_NAME);
        getRegistrationPage().enterEmailToEmailField(INVALID_USER_EMAIL);
        getRegistrationPage().enterPasswordToPasswordField(VALID_PASSWORD);
        getRegistrationPage().enterPasswordToCheckPasswordField(VALID_PASSWORD);
        getRegistrationPage().clickCreateAccountButton();
        Assert.assertTrue(getRegistrationPage().verifyErrorMessageEnterValidEmailVisible());
    }

    @Test
    public void checkRegistrationWithInvalidPassword() {
        getHomePage().clickSignInButton();
        getSignInPage().clickCreateAmazonAccount();
        getRegistrationPage().enterNameToNameField(VALID_USER_NAME);
        getRegistrationPage().enterEmailToEmailField(VALID_USER_EMAIL);
        getRegistrationPage().enterPasswordToPasswordField(INVALID_PASSWORD);
        getRegistrationPage().enterPasswordToCheckPasswordField(INVALID_PASSWORD);
        getRegistrationPage().clickCreateAccountButton();
        Assert.assertTrue(getRegistrationPage().verifyAllertMessageWrongPasswordVisible());
    }

    @Test
    public void checkRegistrationWithEmptyFields() {
        getHomePage().clickSignInButton();
        getSignInPage().clickCreateAmazonAccount();
        getRegistrationPage().clickCreateAccountButton();
        Assert.assertTrue(getRegistrationPage().verifyAlertMessageEnterYourNameVisible());
        Assert.assertTrue(getRegistrationPage().verifyAlertMessageEnterYourEmailVisible());
        Assert.assertTrue(getRegistrationPage().verifyAlertMessageEnterYourPasswordVisible());
    }


}
