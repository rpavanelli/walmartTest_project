package tests.walmart.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import tests.walmart.selenium.WebBrowser;

public abstract class AbstractPage {

	protected WebBrowser browser;

	public WebElement waitForElement(final By by, int timeinSeconds){
		return
		new WebDriverWait(browser.driver() , timeinSeconds).until(new ExpectedCondition<WebElement>() {
			@Override
			public WebElement apply(WebDriver webDriver) {
				return webDriver.findElement(by);
			}
		});
	}
}
