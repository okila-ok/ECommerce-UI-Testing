package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.base.BasePage;

public class StorePage extends BasePage {
    public StorePage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css = "#woocommerce-product-search-field-0")
    WebElement searchTextField;

    @FindBy(xpath = "//button[@value = 'Search']")
    WebElement searchButton;

    public StorePage enterValueIntoSearchTextField(String productName) {
        getWait5().until(ExpectedConditions.elementToBeClickable(searchTextField)).clear();
        searchTextField.sendKeys(productName);
        return this;
    }

    public SearchResultPage clickSearchButton() {
        searchButton.click();
        return new SearchResultPage(getDriver());
    }

}
