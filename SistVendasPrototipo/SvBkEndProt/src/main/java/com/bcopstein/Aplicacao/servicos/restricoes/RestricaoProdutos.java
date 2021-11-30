package com.bcopstein.Aplicacao.servicos.restricoes;

import com.bcopstein.Adaptadores.dtos.ItemCarrinho;

public class RestricaoProdutos implements IRestricoes{


    public RestricaoProdutos(){

    }

    public boolean validaRestricoes(ItemCarrinho[] carrinho){
        for(ItemCarrinho item: carrinho){
            if (item.getQuantidade() > 3){
                return false;
            }
        }
        return true;
    }
}
