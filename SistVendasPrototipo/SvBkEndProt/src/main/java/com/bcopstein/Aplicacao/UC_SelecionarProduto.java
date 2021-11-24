package com.bcopstein.Adaptadores.Aplicacao;

import com.bcopstein.Negocio.entidades.Produto;
import com.bcopstein.Negocio.servicos.ServicoDeProduto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UC_SelecionarProduto {
    private ServicoDeEstoque ServicoDeEstoque;

    @Autowired
    public SelecionarProduto(ServicoDeEstoque ServicoDeEstoque) {
        this.ServicoDeEstoque = ServicoDeEstoque;
    }
    
    public boolean run(int codigo, int quantidade){
        ItemEstoque item = ServicoDeEstoque.findByCodigo(codigo);
        if( item.getQuantidadeDisponivel() < quantidade )
            return true;
        return false;
    }
}