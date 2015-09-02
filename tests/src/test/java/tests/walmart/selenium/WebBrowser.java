package tests.walmart.selenium;
import java.util.concurrent.*;

import org.apache.commons.collections4.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.support.ui.*;

public class WebBrowser {

    private FirefoxDriver driver;
    private final FirefoxProfile profile = new FirefoxProfile();
    private static WebBrowser instance = new WebBrowser();

    private WebBrowser() {
    	start();
	}
    
    public static WebBrowser getInstance() {
    	return instance;
    }
    
    public WebDriver driver() {
        return driver;
    }

    public FirefoxProfile profile() {
        return profile;
    }

    private void start() {
        start(10);
    }

    private void start(int waitForElementsInSeconds) {
        profile.setAcceptUntrustedCertificates(true);
        driver = new FirefoxDriver(profile);

        if (waitForElementsInSeconds > 0) {
            driver().manage().timeouts().implicitlyWait(waitForElementsInSeconds, TimeUnit.SECONDS);
        }
    }

    public void stop() {
        if (driver != null && CollectionUtils.isNotEmpty(driver.getWindowHandles())) {
            for (String windowId : driver.getWindowHandles()) {
                driver.switchTo().window(windowId).close();
            }
        }
    }

    public void waitForPopupClose(final int windowCount, int timeoutInSeconds) {
        new WebDriverWait(driver, timeoutInSeconds).until(new ExpectedCondition<Boolean>() {
            @Override
            public Boolean apply(WebDriver driver) {
                return driver.getWindowHandles().size() < windowCount;
            }
        });
    }
}