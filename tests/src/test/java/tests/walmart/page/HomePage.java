package tests.walmart.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import tests.walmart.selenium.WebBrowser;

public class HomePage {

	private WebBrowser browser;
	private By searchField = By.id("suggestion-search");
	private By searchButton = By.cssSelector("button.search-icon");

	public HomePage(WebBrowser browser) {
		this.browser = browser;
	}

	public void visit(String url) {
		browser.driver().get(url);
	}

	public void search(String term) {
		WebElement fieldSearch = browser.driver().findElement(searchField);
		fieldSearch.clear();
		fieldSearch.sendKeys(term);

		browser.driver().findElement(searchButton).click();
	}

}
