package api.produto;

import api.produto.Utils.Matematica;

public class ServicoPrecificacao {

    void definirPrecoVenda(Produto produto, double percentualMargemLucro) {

        //TODO PODERIA TER CALCULOS MUITOS MAIS COMPLEXOS AQUI;

        double precoVendaCalculado = Matematica.calcularAcrescimo(produto.precoCusto, percentualMargemLucro);
        precoVendaCalculado += Produto.custoEmbalagem;
        produto.precoVenda = precoVendaCalculado;

    }
}
