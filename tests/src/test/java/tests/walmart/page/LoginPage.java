package tests.walmart.page;

import org.junit.Assert;
import org.openqa.selenium.By;

import tests.walmart.selenium.WebBrowser;

public class LoginPage {

	private WebBrowser browser;
	private By productNameOnCart = By.xpath("//*[@id='main']/div/section/div/article/ul/li/ul/li[1]/div/div[1]/a");
	private By finishButton = By.xpath("//*[@id='btn-finalize-cart']");

	public LoginPage(WebBrowser browser) {
		this.browser = browser;
	}

	public void assertThatCartHasProduct(String productName) {
		visit();
		String productNameOnCartText = browser.driver().findElement(productNameOnCart).getText();
		Assert.assertTrue(productNameOnCartText.toLowerCase().trim().equals(productName.toLowerCase().trim()));
	}

	public void visit() {
		browser.driver().get("https://www2.walmart.com.br/checkout/content/carrinho/");
	}

	public void finishBuy() {
		visit();
		browser.driver().findElement(finishButton).click();
	}
}
