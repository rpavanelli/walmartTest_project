package tests.walmart.step;
import org.junit.Assert;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import tests.walmart.page.CartPage;
import tests.walmart.page.LoginPage;
import tests.walmart.selenium.WebBrowser;

public class IntegrationStep3 {

    private final WebBrowser browser = WebBrowser.getInstance();
	private CartPage cartPage = new CartPage(browser);
	private LoginPage loginPage = new LoginPage(browser);
  
	@Quando("^o usuário efetua login com sucesso$")
	public void o_usuário_efetua_login_com_sucesso() throws Throwable {
	    
	}

	@Então("^a página de seleção de endereço é apresentada$")
	public void a_página_de_seleção_de_endereço_é_apresentada() throws Throwable {
	   
	}
    
    public void after() {
        browser.stop();
    }
}