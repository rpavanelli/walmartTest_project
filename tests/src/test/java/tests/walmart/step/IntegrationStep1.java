package tests.walmart.step;

import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import tests.walmart.page.CartPage;
import tests.walmart.page.ResultSearchPage;

import static org.apache.commons.lang3.StringUtils.equalsIgnoreCase;
import static org.apache.commons.lang3.StringUtils.trim;
import static org.junit.Assert.assertTrue;

public class IntegrationStep1 {

	private ResultSearchPage resultSearchPage = new ResultSearchPage();
	private CartPage cartPage = new CartPage();
	private String productName;
  
    @Quando("^o usuário adiciona o produto no carrinho$")
    public void o_usuário_adiciona_o_produto_no_carrinho() throws Throwable {
    	productName = resultSearchPage.addFirstProductOnCart();
    }
    
    @Então("^a página do carrinho de compra deverá conter produto adicionado$")
    public void a_página_do_carrinho_de_compra_deverá_conter_produto_adicionado() throws Throwable {
        assertTrue(equalsIgnoreCase(trim(cartPage.getCartHasProduct()), trim(productName)));
    }
}