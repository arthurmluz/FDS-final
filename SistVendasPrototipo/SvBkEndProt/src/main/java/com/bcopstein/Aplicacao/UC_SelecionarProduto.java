package com.bcopstein.Adaptadores.Aplicacao;

import com.bcopstein.Negocio.entidades.Produto;
import com.bcopstein.Negocio.servicos.ServicoDeProduto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UC_SelecionarProduto {
    private ServicoDeProduto ServicoDeProduto;

    @Autowired
    public SelecionarProduto(ServicoDeProduto ServicoDeProduto) {
        this.ServicoDeProduto = ServicoDeProduto;
    }
    
    public void run(Produto produto){
        ServicoDeProduto.cadastraProduto(produto);
    }
    
}