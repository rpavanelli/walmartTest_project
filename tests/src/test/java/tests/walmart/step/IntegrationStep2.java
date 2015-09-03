package tests.walmart.step;
import org.junit.Assert;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import tests.walmart.page.CartPage;
import tests.walmart.page.LoginPage;
import tests.walmart.selenium.WebBrowser;

public class IntegrationStep2 {

    private final WebBrowser browser = WebBrowser.getInstance();
	private CartPage cartPage = new CartPage(browser);
	private LoginPage loginPage = new LoginPage(browser);
  
    @Quando("^o usuário finaliza a compra do produto$")
    public void o_usuário_finaliza_a_compra_do_produto() throws Throwable {
        cartPage.finishBuy();
    }

    @Então("^a página de login é apresentada$")
    public void a_página_de_login_é_apresentada() throws Throwable {
        Assert.assertTrue(loginPage.isWindowLogin());
    }
    
    public void after() {
        browser.stop();
    }
}