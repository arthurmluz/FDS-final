package com.bcopstein.Aplicacao.UC_Estoque;

import com.bcopstein.Negocio.entidades.ItemEstoque;
import com.bcopstein.Negocio.servicos.ServicoDeEstoque;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UC_ConsultaEstoque {
    private ServicoDeEstoque servicoDeEstoque;

    @Autowired
    public UC_ConsultaEstoque(ServicoDeEstoque servicoDeEstoque){
        this.servicoDeEstoque = servicoDeEstoque;
    }

    public List<ItemEstoque> todos(){
        return servicoDeEstoque.todos();
    }
}
