#language:pt
Funcionalidade: CheckOut de produto

  Cenario: Usuário finaliza compra do produto
    Dado que o usuário acesse o site "http://www.walmart.com.br"
    E que o usuário pesquisa produto com termo "tv"
    E que o usuário adiciona o produto "tv" no carrinho
    Quando o usuário finaliza a compra do produto
    Então a página de login é apresentada