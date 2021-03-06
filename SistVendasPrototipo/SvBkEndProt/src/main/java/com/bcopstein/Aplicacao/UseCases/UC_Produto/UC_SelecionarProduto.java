package com.bcopstein.Aplicacao.UseCases.UC_Produto;

import com.bcopstein.Negocio.entidades.ItemEstoque;
import com.bcopstein.Negocio.servicos.ServicoDeEstoque;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UC_SelecionarProduto {
    private ServicoDeEstoque ServicoDeEstoque;

    @Autowired
    public void SelecionarProduto(ServicoDeEstoque ServicoDeEstoque) {
        this.ServicoDeEstoque = ServicoDeEstoque;
    }
    
    public boolean run(int codigo, int quantidade){
        ItemEstoque item = ServicoDeEstoque.procuraPorCodProduto(codigo);
        if( item == null )
            return false;
        return item.getQuantidadeDisponivel() >= quantidade;
    }
}