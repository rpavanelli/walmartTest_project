#language:pt
Funcionalidade: Login

  Cenario: Usuário efetua login para compra
    Dado que o usuário acesse o site "http://www.walmart.com.br"
    	E que o usuário pesquisa produto com termo "tv"
    	E que o usuário adiciona o produto "tv" no carrinho
    	E que o usuário finaliza a compra do produto
    Quando login efetuado com sucesso
    Então a página de seleção de endereço é apresentada