package com.bcopstein.Aplicacao.UseCases.UC_Vendas;

import com.bcopstein.Adaptadores.dtos.ItemCarrinho;
import com.bcopstein.Negocio.entidades.Produto;
import com.bcopstein.Negocio.servicos.ServicoDeProduto;
import com.bcopstein.Aplicacao.servicos.impostos.ServicoImposto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UC_CalculaSubTotal {
    private ServicoDeProduto servicoDeProduto;
    private ServicoImposto servicoImposto;

    @Autowired
    public UC_CalculaSubTotal(ServicoDeProduto servicoDeProduto, ServicoImposto servicoImposto){
        this.servicoDeProduto = servicoDeProduto;
        this.servicoImposto = servicoImposto;
    }

    public Double[] run(ItemCarrinho[] carrinho){
        Double[] valores = new Double[3];
        double subtotal = 0.0;
        double imposto = 0.0;

        for(ItemCarrinho item: carrinho){
            Produto prod = servicoDeProduto.procura(item.getCodigo());
            subtotal += prod.getPreco() * item.getQuantidade();
            imposto += servicoImposto.calculaImpostos(prod.getPreco(),prod.getCategoria());
        }

        //imposto += servicoImposto.calculaImpostos(subtotal);

        valores[0] = subtotal;
        valores[1] = imposto;
        valores[2] = subtotal + imposto;

        return valores;
    }
}
