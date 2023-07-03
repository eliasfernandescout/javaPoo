package api.produto;

public class ServicoPrecificacao {

    void definirPrecoVenda(Produto produto, double percentualMargemLucro){

        //TODO PODERIA TER CALCULOS MUITOS MAIS COMPLEXOS AQUI;

        produto.precoVenda = produto.precoCusto * ((percentualMargemLucro/100)+1);
    }
}
