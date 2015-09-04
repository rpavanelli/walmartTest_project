package tests.walmart.step;

import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import tests.walmart.page.LoginPage;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang3.StringUtils.containsIgnoreCase;

public class IntegrationStep3 {

    private LoginPage loginPage = new LoginPage();

    @Quando("^o usuário efetua login com sucesso com usuário \"(.*?)\" e senha \"(.*?)\"$")
    public void o_usuário_efetua_login_com_sucesso_com_usuário_e_senha(String user, String password) throws Throwable {
        loginPage.register(user, password);
    }

    @Então("^a página de seleção de endereço é apresentada$")
    public void a_página_de_seleção_de_endereço_é_apresentada() throws Throwable {
        assertTrue(containsIgnoreCase(loginPage.getDriver().getTitle(), "endereço de entrega"));
    }
}