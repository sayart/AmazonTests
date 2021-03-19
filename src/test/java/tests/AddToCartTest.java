package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AddToCartTest extends BaseTest {

    private String SEARCH_REQUEST_TEXT = "iphone 11 case";
    private String EXPECTED_CART_COUNT = "1";

    @Test
    public void checkAddToCart() {
        getHomePage().enterTextToSearchField(SEARCH_REQUEST_TEXT);
        getHomePage().clickSearchButton();
        getSearchResultPage().waitForPageReadyState(30);
        getSearchResultPage().clickIphoneBumperCase();
        getIphoneBumperCasePage().clickAddToCartButton();
        Assert.assertEquals(getHomePage().actualProductCountInCart(), EXPECTED_CART_COUNT);
    }
}
