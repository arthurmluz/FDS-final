package com.bcopstein.Aplicacao.UseCases.UC_Produto;

import com.bcopstein.Negocio.entidades.Produto;
import com.bcopstein.Negocio.servicos.ServicoDeProduto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UC_ConsultaProdutos {
    private ServicoDeProduto servicoDeProduto;

    @Autowired
    public UC_ConsultaProdutos(ServicoDeProduto servicoDeProduto){
        this.servicoDeProduto = servicoDeProduto;
    }

    public List<Produto> run(){
        return servicoDeProduto.todos();
    }
}
