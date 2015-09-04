package tests.walmart.step;

import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import tests.walmart.page.CartPage;
import tests.walmart.page.LoginPage;

import static org.junit.Assert.assertTrue;

public class IntegrationStep2 {

	private CartPage cartPage = new CartPage();
	private LoginPage loginPage = new LoginPage();
  
    @Quando("^o usuário finaliza a compra do produto$")
    public void o_usuário_finaliza_a_compra_do_produto() throws Throwable {
        cartPage.finishBuy();
    }

    @Então("^a página de login é apresentada$")
    public void a_página_de_login_é_apresentada() throws Throwable {
        assertTrue(loginPage.isWindowLoginExists());
    }

}