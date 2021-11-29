package com.bcopstein.Aplicacao.UseCases.UC_Estoque;

import com.bcopstein.Negocio.entidades.Produto;
import com.bcopstein.Negocio.servicos.ServicoDeEstoque;
import com.bcopstein.Negocio.servicos.ServicoDeProduto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UC_InsereEstoque {
    private ServicoDeEstoque servicoDeEstoque;
    private ServicoDeProduto servicoDeProduto;


    @Autowired
    public UC_InsereEstoque(ServicoDeEstoque servicoDeEstoque, ServicoDeProduto servicoDeProduto){
        this.servicoDeEstoque = servicoDeEstoque;
        this.servicoDeProduto = servicoDeProduto;
    }

    public boolean run(int quantidade, int codProduto){
        Produto prod = servicoDeProduto.procura(codProduto);
        if( prod == null)
            return false;
        int id = (servicoDeEstoque.todos()).size();
        return servicoDeEstoque.insere(id, quantidade, codProduto);
    }
}
