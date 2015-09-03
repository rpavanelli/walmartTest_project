#language:pt
Funcionalidade: Login
@WIP
  Cenario: Usuário efetua login para compra
    Dado que o usuário acesse o site "http://www.walmart.com.br"
    Quando o usuário pesquisa produto com termo "tv"
    E o usuário adiciona o produto no carrinho
    E o usuário finaliza a compra do produto
    E o usuário efetua login com sucesso
    Então a página de seleção de endereço é apresentada