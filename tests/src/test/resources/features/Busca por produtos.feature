#language:pt
Funcionalidade: Busca por produtos

  Cenario: Usuário pesquisa tv no site do Walmart
    Dado que o usuário acesse o site "http://www.walmart.com.br"
    Quando o usuário pesquisa produto com termo "tv"
    Então a página com os resultados da pesquisa deverá conter produtos com o termo buscado