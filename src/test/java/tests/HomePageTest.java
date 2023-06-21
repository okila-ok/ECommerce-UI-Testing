package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SearchResultPage;
import pages.StorePage;
import tests.base.BaseTest;

public class HomePageTest extends BaseTest {

    @Test
    public void testFeaturedProductsText() {

        String expectedResult = "Featured Products";

        String actualResult = new HomePage(getDriver())
                .getFeaturedProductsText();

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public  void testSearchResultsNamePresent() {

        String expectedResult = "Shoes";

        HomePage homePage = new HomePage(getDriver());
        StorePage storePage = homePage.clickStoreLinkOnDesktopHeader();
        storePage.enterValueIntoSearchTextField(expectedResult);
        SearchResultPage searchResultPage = storePage.clickSearchButton();
        String actualResult = searchResultPage.getSearchResultText();

        Assert.assertTrue(actualResult.contains(expectedResult), "Search Result does not contain " + expectedResult);
    }

    @Test
    public  void testSearchResultsNamePresentRefactored() {

        String expectedResult = "Shoes";

        String actualResult = new HomePage(getDriver())
            .clickStoreLinkOnDesktopHeader()
            .enterValueIntoSearchTextField(expectedResult)
            .clickSearchButton()
            .getSearchResultText();

        Assert.assertTrue(actualResult.contains(expectedResult), "Search Result does not contain " + expectedResult);
    }
}
