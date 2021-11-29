package com.bcopstein.Aplicacao.UseCases.UC_Estoque;

import com.bcopstein.Aplicacao.dtos.GerencialDTO;
import com.bcopstein.Negocio.Categorias;
import com.bcopstein.Negocio.entidades.ItemEstoque;
import com.bcopstein.Negocio.entidades.ItemVenda;
import com.bcopstein.Negocio.entidades.Produto;
import com.bcopstein.Negocio.entidades.Venda;
import com.bcopstein.Negocio.servicos.ServicoDeEstoque;
import com.bcopstein.Negocio.servicos.ServicoDeItemVenda;
import com.bcopstein.Negocio.servicos.ServicoDeProduto;
import com.bcopstein.Negocio.servicos.ServicoDeVenda;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class UC_ConsultaGerencia {
    private ServicoDeEstoque servicoDeEstoque;
    private ServicoDeProduto servicoDeProduto;
    private ServicoDeItemVenda servicoDeItemVenda;
    private ServicoDeVenda servicoDeVenda;

    @Autowired
    public UC_ConsultaGerencia(ServicoDeEstoque servicoDeEstoque,
                               ServicoDeItemVenda servicoDeItemVenda,
                               ServicoDeProduto servicoDeProduto){
        this.servicoDeEstoque = servicoDeEstoque;
        this.servicoDeItemVenda = servicoDeItemVenda;
        this.servicoDeProduto = servicoDeProduto;
    }

    public GerencialDTO run(){
        double valorEstoque = 0;
        List<ItemEstoque> itensEstoque = servicoDeEstoque.todos();

        for( ItemEstoque item : itensEstoque ){
            valorEstoque += servicoDeProduto.procura(item.getCodProduto()).getPreco() * item.getQuantidadeDisponivel();
        }

        double valorTotalVendas = servicoDeVenda.todos().stream()
                .mapToDouble(Venda::getTotal).sum();

        StringBuilder relatorio = new StringBuilder();
        for(Categorias categoria : Categorias.values()){
            double valor = servicoDeItemVenda.todos()
                    .stream()
                    .filter(x -> servicoDeProduto.procura(x.getCodProduto())
                            .getCategoria().equals(categoria))
                    .mapToDouble(x -> x.getPrecoUnitVenda() * x.getQuantidade())
                    .sum();
            relatorio.append("Categoria: [").append(categoria).append("] Valor Total vendido: [").append(valor).append("]\n");
        }

        return new GerencialDTO(valorEstoque, valorTotalVendas, relatorio);

    }
}
