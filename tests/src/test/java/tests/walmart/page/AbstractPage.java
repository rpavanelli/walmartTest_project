package tests.walmart.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import tests.walmart.selenium.WebBrowser;

public abstract class AbstractPage {

    private final WebBrowser browser;

    protected AbstractPage() {
        this.browser = WebBrowser.getInstance();
    }

    public WebElement waitForElement(final By by, int timeInSeconds) {
        WebDriverWait webDriverWait = new WebDriverWait(getDriver(), timeInSeconds);
        return webDriverWait.until(new ExpectedCondition<WebElement>() {
            public WebElement apply(WebDriver webDriver) {
                return webDriver.findElement(by);
            }
        });
    }

    public WebDriver waitIframe(final By by, int timeInSeconds) {
        return getDriver().switchTo().frame(waitForElement(by, timeInSeconds));
    }

    public void visit(String url) {
        getDriver().get(url);
    }

    public WebElement findElement(By by) {
        return getDriver().findElement(by);
    }

    public WebDriver getDriver() {
        return browser.driver();
    }
}
