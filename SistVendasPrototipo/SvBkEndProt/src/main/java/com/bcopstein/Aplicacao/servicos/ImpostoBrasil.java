package com.bcopstein.Aplicacao.servicos;

import com.bcopstein.Negocio.Categorias;
import com.bcopstein.Negocio.repositorios.ItemVendaRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ImpostoBrasil implements ICalculoImposto{
    private double impostoPercent = 0.12;

    @Autowired
    public ImpostoBrasil(){}

    public double calculaImposto(double subtotal, Categorias categoria){
        return subtotal * impostoPercent;
    }
}