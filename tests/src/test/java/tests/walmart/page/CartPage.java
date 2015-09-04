package tests.walmart.page;

import org.openqa.selenium.By;

public class CartPage extends AbstractPage {

    private By productNameOnCart = By.cssSelector("#category-products section ul li.shelf-item a");
    private By finishButton = By.id("btn-finalize-cart");
    private By cartButton = By.cssSelector("header div.cart a.cart-link");

    public String getCartHasProduct() {
        return waitForElement(productNameOnCart, 5).getText();
    }

    public void finishBuy() {
        findElement(cartButton).click();
        waitForElement(finishButton, 5).click();
    }
}
