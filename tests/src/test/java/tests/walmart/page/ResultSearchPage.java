package tests.walmart.page;

import static org.junit.Assert.assertTrue;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;

import tests.walmart.selenium.WebBrowser;

public class ResultSearchPage {

	private WebBrowser browser;
	private By resultField = By.cssSelector("span.result-items");
	private By firstProductOnResult = By.xpath("//*[@id='category-products']/section/ul/li[1]/div/a/span");
	private By firstProductBuyButton = By.xpath("//*[@id='buybox-Walmart']/div[2]/div/div[5]/button/span[2]");
	private By buyContinueButton = By.xpath("//*[@id='navegaCarrinho']");
	private String termResult;

	public ResultSearchPage(WebBrowser browser) {
		this.browser = browser;
	}

	public void assertThatExistAtLeastOneResult() {
		String result = browser.driver().findElement(resultField).getText();
		Integer numberResult = Integer.valueOf(StringUtils.substringBefore(result, " "));
		assertTrue(numberResult > 0);
	}

	public void assertThatExistOneProductOnResult(String term) {
		termResult = browser.driver().findElement(firstProductOnResult).getText();
		assertTrue(termResult.toLowerCase().contains(term.toLowerCase()));
	}

	public String addFirstProductOnCart() {
		termResult = browser.driver().findElement(firstProductOnResult).getText();
		browser.driver().findElement(firstProductOnResult).click();
		browser.driver().findElement(firstProductBuyButton).click();
		browser.driver().findElement(buyContinueButton).click();
		return termResult;
	}
}
