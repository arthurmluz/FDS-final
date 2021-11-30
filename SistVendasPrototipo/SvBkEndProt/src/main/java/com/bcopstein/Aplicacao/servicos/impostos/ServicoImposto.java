package com.bcopstein.Aplicacao.servicos.impostos;

import com.bcopstein.Negocio.Categorias;
import com.bcopstein.Negocio.repositorios.ItemVendaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServicoImposto {
    private ItemVendaRepository ItemVendaRep;
    private ICalculoImposto calculoImposto;

    @Autowired
    public ServicoImposto(ItemVendaRepository ItemVendaRep, ICalculoImposto calculoImposto){
        this.ItemVendaRep = ItemVendaRep;
        this.calculoImposto = calculoImposto;
    }

    public double calculaImpostos(double subtotal, Categorias categoria){
        return calculoImposto.calculaImposto(subtotal,categoria);
    }
}
