package com.bcopstein.Aplicacao.servicos.restricoes;

import com.bcopstein.Adaptadores.dtos.ItemCarrinho;

public interface IRestricoes {
    boolean validaRestricoes(ItemCarrinho[] carrinho);
}
