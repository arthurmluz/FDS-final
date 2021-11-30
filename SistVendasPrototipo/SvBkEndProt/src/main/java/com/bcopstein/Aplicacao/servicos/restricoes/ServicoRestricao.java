package com.bcopstein.Aplicacao.servicos.restricoes;

import com.bcopstein.Adaptadores.dtos.ItemCarrinho;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServicoRestricao {
    private IRestricoes iRestricoes;

    @Autowired
    public ServicoRestricao(IRestricoes iRestricoes){
        this.iRestricoes = iRestricoes;
    }

   public boolean validaRestricao(ItemCarrinho[] carrinho) {
        return iRestricoes.validaRestricoes(carrinho);
   }

}
