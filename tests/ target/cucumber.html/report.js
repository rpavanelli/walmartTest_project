$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/Efetua Login.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language:pt"
    }
  ],
  "line": 2,
  "name": "Login",
  "description": "",
  "id": "login",
  "keyword": "Funcionalidade"
});
formatter.scenario({
  "line": 4,
  "name": "Usuário efetua login para compra",
  "description": "",
  "id": "login;usuário-efetua-login-para-compra",
  "type": "scenario",
  "keyword": "Cenario",
  "tags": [
    {
      "line": 3,
      "name": "@WIP"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "que o usuário acesse o site \"http://www.walmart.com.br\"",
  "keyword": "Dado "
});
formatter.step({
  "line": 6,
  "name": "o usuário pesquisa produto com termo \"tv\"",
  "keyword": "Quando "
});
formatter.step({
  "line": 7,
  "name": "o usuário adiciona o produto no carrinho",
  "keyword": "E "
});
formatter.step({
  "line": 8,
  "name": "o usuário finaliza a compra do produto",
  "keyword": "E "
});
formatter.step({
  "line": 9,
  "name": "o usuário efetua login com sucesso",
  "keyword": "E "
});
formatter.step({
  "line": 10,
  "name": "a página de seleção de endereço é apresentada",
  "keyword": "Então "
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.walmart.com.br",
      "offset": 29
    }
  ],
  "location": "IntegrationStep.que_o_usuário_acesse_o_site(String)"
});
formatter.result({
  "duration": 27971001015,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "tv",
      "offset": 38
    }
  ],
  "location": "IntegrationStep.o_usuário_pesquisa_produto_com_termo(String)"
});
formatter.result({
  "duration": 2432331563,
  "status": "passed"
});
formatter.match({
  "location": "IntegrationStep1.o_usuário_adiciona_o_produto_no_carrinho()"
});
formatter.result({
  "duration": 17254590239,
  "status": "passed"
});
formatter.match({
  "location": "IntegrationStep2.o_usuário_finaliza_a_compra_do_produto()"
});
formatter.result({
  "duration": 10940354943,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});