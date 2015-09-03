#language:pt
Funcionalidade: CheckOut de produto

  Cenario: Usuário finaliza compra do produto
    Dado que o usuário acesse o site "http://www.walmart.com.br"
    Quando o usuário pesquisa produto com termo "tv"
    E o usuário adiciona o produto no carrinho
    E o usuário finaliza a compra do produto
    Então a página de login é apresentada