package tests.walmart.page;

import org.openqa.selenium.By;
import tests.walmart.selenium.WebBrowser;

public class LoginPage extends AbstractPage {

	private By loginWindow = By.id("iframeLogin");
	private By signinUser = By.xpath("//*[@id='signinButtonSend']");

	public LoginPage(WebBrowser browser) {
		this.browser = browser;
	}
	
	public void visit() {
		browser.driver().get("https://www2.walmart.com.br/checkout/");
	}

	public boolean isWindowLogin() {
		return waitForElement(loginWindow, 10).isDisplayed();
	}
	
	public void finishBuy() {
		visit();
		browser.driver().findElement(signinUser).click();
	}
}
