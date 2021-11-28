package com.bcopstein.Aplicacao.UC_Vendas;

import com.bcopstein.Adaptadores.controllers.LoggingController;
import com.bcopstein.Adaptadores.dtos.ItemCarrinho;
import com.bcopstein.Negocio.entidades.ItemEstoque;
import com.bcopstein.Negocio.entidades.ItemVenda;
import com.bcopstein.Negocio.entidades.Produto;
import com.bcopstein.Negocio.entidades.Venda;
import com.bcopstein.Negocio.servicos.ServicoDeEstoque;
import com.bcopstein.Negocio.servicos.ServicoDeItemVenda;
import com.bcopstein.Negocio.servicos.ServicoDeProduto;
import com.bcopstein.Negocio.servicos.ServicoDeVenda;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class UC_EfetivarVenda {
    private ServicoDeVenda servicoDeVenda;
    private ServicoDeEstoque servicoDeEstoque;
    private ServicoDeProduto servicoDeProduto;
    private ServicoDeItemVenda servicoDeItemVenda;

    Logger logger = LoggerFactory.getLogger(LoggingController.class);

    @Autowired
    public UC_EfetivarVenda(ServicoDeVenda ServicoDeVenda, ServicoDeEstoque servicoDeEstoque,
                            ServicoDeProduto servicoDeProduto, ServicoDeItemVenda servicoDeItemVenda) {
        this.servicoDeVenda = ServicoDeVenda;
        this.servicoDeEstoque = servicoDeEstoque;
        this.servicoDeProduto = servicoDeProduto;
        this.servicoDeItemVenda = servicoDeItemVenda;
    }


    public boolean run(ItemCarrinho[] carrinho){
        // chamar o servico de vendas e de estoque
        ArrayList<ItemVenda> itemVendas = new ArrayList<>();
        int id = (servicoDeItemVenda.todos()).size();

        for(ItemCarrinho item: carrinho){
            Produto prod = servicoDeProduto.procura(item.getCodigo());

            ItemEstoque itemEstoque = servicoDeEstoque.procuraPorCodProduto(item.getCodigo());
            servicoDeEstoque.remove(itemEstoque, item.getQuantidade());

            ItemVenda itemVenda = new ItemVenda(id++, item.getQuantidade(), item.getCodigo(), prod.getPreco());
            servicoDeItemVenda.cadastra(itemVenda);

            itemVendas.add(itemVenda);
        }

        Date data = new Date();
        Venda venda = new Venda(data, itemVendas);
        return servicoDeVenda.cadastraVenda(venda);
    }
    
}
