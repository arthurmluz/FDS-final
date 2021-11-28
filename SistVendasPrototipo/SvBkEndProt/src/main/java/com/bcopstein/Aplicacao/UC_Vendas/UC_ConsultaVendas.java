package com.bcopstein.Aplicacao.UC_Vendas;

import com.bcopstein.Negocio.entidades.Venda;
import com.bcopstein.Negocio.servicos.ServicoDeVenda;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UC_ConsultaVendas {
    private ServicoDeVenda servicoDeVenda;

    @Autowired
    public UC_ConsultaVendas(ServicoDeVenda servicoDeVenda){
        this.servicoDeVenda = servicoDeVenda;
    }

    public List<Venda> run(){return servicoDeVenda.todos();}
}
