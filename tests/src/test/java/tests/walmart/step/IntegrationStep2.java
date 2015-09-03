package tests.walmart.step;
import org.junit.Assert;

import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import tests.walmart.page.CartPage;
import tests.walmart.page.ResultSearchPage;
import tests.walmart.selenium.WebBrowser;

public class IntegrationStep2 {

    private final WebBrowser browser = WebBrowser.getInstance();
	private ResultSearchPage resultSearchPage = new ResultSearchPage(browser);
	private CartPage cartPage = new CartPage(browser);
	private String productName;
  
    @Quando("^o usuário finaliza a compra do produto$")
    public void o_usuário_finaliza_a_compra_do_produto() throws Throwable {
        cartPage.finishBuy();
    }

    @Então("^a página de login é apresentada$")
    public void a_página_de_login_é_apresentada() throws Throwable {
        Assert.assertTrue(cartPage.isWindowLogin());
    }
    
    public void after() {
        browser.stop();
    }
}