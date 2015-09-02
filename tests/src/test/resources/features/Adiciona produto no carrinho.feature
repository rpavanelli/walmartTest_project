#language:pt
Funcionalidade: Carrinho de compra

  @WIP
  Cenario: Usuário adiciona produto no carrinho de compra
    Dado que o usuário acesse o site "http://www.walmart.com.br"
    Quando o usuário pesquisa produto com termo "tv"
    E o usuário adiciona o produto no carrinho
    Então a página do carrinho de compra deverá conter produto adicionado