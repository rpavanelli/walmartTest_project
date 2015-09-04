package tests.walmart.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage extends AbstractPage {

    private By searchField = By.id("suggestion-search");
    private By searchButton = By.cssSelector("button.search-icon");

    public void search(String term) {
        WebElement fieldSearch = findElement(searchField);
        fieldSearch.clear();
        fieldSearch.sendKeys(term);

        findElement(searchButton).click();
    }

}
