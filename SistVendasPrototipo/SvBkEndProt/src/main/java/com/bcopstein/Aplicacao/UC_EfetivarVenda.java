package com.bcopstein.Aplicacao;

import com.bcopstein.Adaptadores.dtos.ItemCarrinho;
import com.bcopstein.Negocio.entidades.ItemEstoque;
import com.bcopstein.Negocio.entidades.ItemVenda;
import com.bcopstein.Negocio.entidades.Produto;
import com.bcopstein.Negocio.entidades.Venda;
import com.bcopstein.Negocio.servicos.ServicoDeEstoque;
import com.bcopstein.Negocio.servicos.ServicoDeVenda;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class UC_EfetivarVenda {
    private ServicoDeVenda servicoDeVenda;
    private ServicoDeEstoque servicoDeEstoque;

    @Autowired
    public UC_EfetivarVenda(ServicoDeVenda ServicoDeVenda, ServicoDeEstoque servicoDeEstoque) {
        this.servicoDeVenda = ServicoDeVenda;
        this.servicoDeEstoque = servicoDeEstoque;
    }


    public boolean run(ItemCarrinho[] carrinho){
        // chamar o servico de vendas e de estoque
        ArrayList<ItemVenda> itemVendas = new ArrayList<>();
        for(ItemCarrinho item: carrinho){
            itemVendas.add(new ItemVenda(item.getQuantidade(), item.getCodigo()));
        }

        Date data = new Date();
        Venda venda = new Venda(data, itemVendas);
        servicoDeVenda.cadastraVenda(venda);
        return true;
    }
    
}
