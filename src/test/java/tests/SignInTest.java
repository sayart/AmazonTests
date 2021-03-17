package tests;

import javafx.scene.control.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class SignInTest extends BaseTest{

    private String INVALID_EMAIL = "slar123t@gmail.com";
    private String INVALID_PASSWORD = "1234567";

    @Test(priority = 1)
    public void checkSingInWithValidDate(){
        getHomePage().clickSignInButton();
        getSignInPage().enterEmailToEmailField(getLoginFromFile());
        getSignInPage().clickContinueButton();
        getSignInPage().enterPasswordToPasswordField(getPasswordFromFile());
        getSignInPage().clickSignInButton();
        getHomePage().implicitWait(10);
        Assert.assertTrue(getHomePage().userNameVisible());
    }

    @Test(priority = 1)
    public void checkSignInWithInvalidEmail(){
        getHomePage().clickSignInButton();
        getSignInPage().enterEmailToEmailField(INVALID_EMAIL);
        getSignInPage().clickContinueButton();
        Assert.assertTrue(getSignInPage().errorMessageVisible());
    }

    @Test(priority = 1)
    public void checkSignInWithInvalidPassword(){
        getHomePage().clickSignInButton();
        getSignInPage().enterEmailToEmailField(getLoginFromFile());
        getSignInPage().clickContinueButton();
        getSignInPage().enterPasswordToPasswordField(INVALID_PASSWORD);
        getSignInPage().clickSignInButton();
        getSignInPage().implicitWait(30);
        Assert.assertTrue(getSignInPage().errorMessageVisibleWrongPassword());
    }


    private String getLoginFromFile(){
        try {
            return new String(Files.readAllBytes(Paths.get("D:\\login.txt")), StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
            return "admin@aws.com";
        }
    }

    private String getPasswordFromFile(){
        try {
            return new String(Files.readAllBytes(Paths.get("D:\\password.txt")), StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
            return "123456";
        }
    }
}
