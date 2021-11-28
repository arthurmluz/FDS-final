package com.bcopstein.Aplicacao;

import com.bcopstein.Negocio.servicos.ServicoDeEstoque;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UC_InsereEstoque {
    private ServicoDeEstoque servicoDeEstoque;


    @Autowired
    public UC_InsereEstoque(ServicoDeEstoque servicoDeEstoque){
        this.servicoDeEstoque = servicoDeEstoque;
    }

    public void run(int qtd, int codProduto){
        servicoDeEstoque.insere(qtd, codProduto);
    }
}
