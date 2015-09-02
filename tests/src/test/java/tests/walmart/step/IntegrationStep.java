package tests.walmart.step;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import tests.walmart.page.HomePage;
import tests.walmart.page.ResultSearchPage;
import tests.walmart.selenium.WebBrowser;


public class IntegrationStep {

    private final WebBrowser browser = WebBrowser.getInstance();
	private String term;
	private HomePage homePage = new HomePage(browser);
	private ResultSearchPage resultSearchPage = new ResultSearchPage(browser);

    @Dado("^que o usuário acesse o site \"(.*?)\"$")
    public void que_o_usuário_acesse_o_site(String url) throws Throwable {
    	homePage.visit(url);
    }

    @Quando("^o usuário pesquisa produto com termo \"(.*?)\"$")
    public void o_usuário_pesquisa_produto_com_termo(String term) throws Throwable {
         this.term = term;
         homePage.search(term);
    }

    @Então("^a página com os resultados da pesquisa deverá conter produtos com o termo buscado$")
    public void a_página_com_os_resultados_da_pesquisa_deverá_conter_produtos_com_o_termo_buscado() throws Throwable {
    	resultSearchPage.assertThatExistAtLeastOneResult();
    	resultSearchPage.assertThatExistOneProductOnResult(term);
    }
}