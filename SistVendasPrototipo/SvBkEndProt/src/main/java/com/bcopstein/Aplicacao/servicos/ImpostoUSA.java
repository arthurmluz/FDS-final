package com.bcopstein.Aplicacao.servicos;

import com.bcopstein.Negocio.Categorias;
import org.springframework.beans.factory.annotation.Autowired;

public class ImpostoUSA implements ICalculoImposto {
    private double impostoPercent = 0.15;

    @Autowired
    public ImpostoUSA(){}

    public double calculaImposto(double subtotal, Categorias categorias){
        if(subtotal > 8000.0){
            impostoPercent = 0.20;
        }
        return (subtotal * impostoPercent);
    }
}
