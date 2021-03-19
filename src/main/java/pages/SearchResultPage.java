package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResultPage extends BasePage {
    @FindBy(xpath = "//span[contains(text(), 'TENOC Phone Case')]")
    private WebElement iphoneBumperCase;

    public SearchResultPage(WebDriver driver) {
        super(driver);
    }

    public void clickIphoneBumperCase() {
        iphoneBumperCase.click();
    }


}
