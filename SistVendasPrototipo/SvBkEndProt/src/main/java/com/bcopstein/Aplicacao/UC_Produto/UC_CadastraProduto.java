package com.bcopstein.Aplicacao.UC_Produto;

import com.bcopstein.Negocio.entidades.Produto;
import com.bcopstein.Negocio.servicos.ServicoDeProduto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UC_CadastraProduto {
    private ServicoDeProduto servicoDeProduto;

    @Autowired
    public UC_CadastraProduto(ServicoDeProduto servicoDeProduto){
        this.servicoDeProduto = servicoDeProduto;
    }

    public void run(Produto produto){
        servicoDeProduto.cadastraProduto(produto);
    }
}
