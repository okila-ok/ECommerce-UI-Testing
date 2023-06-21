package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.base.BasePage;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//h2[text() = 'Featured Products']")
    WebElement featuredProducts;
    @FindBy(xpath = "//div[@id = 'ast-desktop-header']")
    WebElement desktopHeader;

    public String getFeaturedProductsText() {
        return featuredProducts.getText();
    }

    public StorePage clickStoreLinkOnDesktopHeader() {
        getWait5().until(ExpectedConditions.visibilityOf(desktopHeader))
            .findElement(By.cssSelector("a[href = 'https://askomdch.com/store/']")).click();
        return new StorePage(getDriver());
    }
}
