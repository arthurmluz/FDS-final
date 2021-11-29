package com.bcopstein.Aplicacao.UseCases.UC_Estoque;

import com.bcopstein.Negocio.entidades.ItemEstoque;
import com.bcopstein.Negocio.servicos.ServicoDeEstoque;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UC_RemoveEstoque {
    private ServicoDeEstoque servicoDeEstoque;

    @Autowired
    public UC_RemoveEstoque(ServicoDeEstoque servicoDeEstoque){
        this.servicoDeEstoque = servicoDeEstoque;
    }

    public boolean run(int quantidade, int codProduto){
        ItemEstoque item = servicoDeEstoque.procuraPorCodProduto(codProduto);
        if( item == null )
            return false;

        if( quantidade > item.getQuantidadeDisponivel() )
            return false;
       return servicoDeEstoque.remove(item, quantidade);
    }
}
