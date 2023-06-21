package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.base.BasePage;

public class SearchResultPage extends BasePage {
    public SearchResultPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(tagName = "h1")
    WebElement searchResult;

    public String getSearchResultText() {
        return getWait5().until(ExpectedConditions.visibilityOf(searchResult)).getText();
    }
}
