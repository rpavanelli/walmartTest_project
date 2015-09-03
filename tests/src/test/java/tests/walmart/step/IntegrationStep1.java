package tests.walmart.step;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import tests.walmart.page.CartPage;
import tests.walmart.page.ResultSearchPage;
import tests.walmart.selenium.WebBrowser;

public class IntegrationStep1 {

    private final WebBrowser browser = WebBrowser.getInstance();
	private ResultSearchPage resultSearchPage = new ResultSearchPage(browser);
	private CartPage cartPage = new CartPage(browser);
	private String productName;
  
    @Quando("^o usuário adiciona o produto no carrinho$")
    public void o_usuário_adiciona_o_produto_no_carrinho() throws Throwable {
    	productName = resultSearchPage.addFirstProductOnCart();
    }
    
    @Então("^a página do carrinho de compra deverá conter produto adicionado$")
    public void a_página_do_carrinho_de_compra_deverá_conter_produto_adicionado() throws Throwable {
    	Thread.sleep(10000);
    	cartPage.assertThatCartHasProduct(productName);
    }

    public void after() {
        browser.stop();
    }
}