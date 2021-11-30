package com.bcopstein.Aplicacao.servicos.restricoes;

import com.bcopstein.Adaptadores.dtos.ItemCarrinho;

public class RestricaoCarrinho implements IRestricoes{
    public RestricaoCarrinho(){

    }
    public boolean validaRestricoes(ItemCarrinho[] carrinho){
        int quantidade = 0;
        for(ItemCarrinho item: carrinho){
            quantidade += item.getQuantidade();
            if (quantidade > 6){
                return false;
            }
        }
        return true;
    }
}
