package com.bcopstein.Aplicacao;

import com.bcopstein.Negocio.entidades.ItemVenda;
import com.bcopstein.Negocio.entidades.Venda;
import com.bcopstein.Negocio.servicos.ServicoDeVenda;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UC_EfetivarVenda {
    private ServicoDeVenda ServicoDeVenda;

    @Autowired
    public void EfetivarVenda(ServicoDeVenda ServicoDeVenda) {
        this.ServicoDeVenda = ServicoDeVenda;
    }
    
    public boolean run(Venda venda){
        ServicoDeVenda.cadastraVenda(venda);
    }
    
}
