package tests.walmart.page;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;

public class ResultSearchPage extends AbstractPage {

    private By resultField = By.cssSelector("span.result-items");
    private By firstProductOnResult = By.xpath("//*[@id='category-products']/section/ul/li[1]/div/a/span");
    private By firstProductBuyButton = By.xpath("//*[@id='buybox-Walmart']/div[2]/div/div[5]/button/span[2]");
    private By buyContinueButton = By.id("navegaCarrinho");
    private String termResult;

    public int getLeastOneResult() {
        String result = findElement(resultField).getText();
        return Integer.valueOf(StringUtils.substringBefore(result, " "));
    }

    public String getOneProductOnResult() {
        return findElement(firstProductOnResult).getText();
    }

    public String addFirstProductOnCart() {
        termResult = findElement(firstProductOnResult).getText();
        findElement(firstProductOnResult).click();
        findElement(firstProductBuyButton).click();

        waitForElement(buyContinueButton, 10).click();
        return termResult;
    }
}
