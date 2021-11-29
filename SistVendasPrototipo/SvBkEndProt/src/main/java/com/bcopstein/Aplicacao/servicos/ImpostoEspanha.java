package com.bcopstein.Aplicacao.servicos;

import com.bcopstein.Negocio.Categorias;
import org.springframework.beans.factory.annotation.Autowired;

public class ImpostoEspanha implements ICalculoImposto {
    private double impostoPercent; // por categoria

    @Autowired
    public ImpostoEspanha(){}

    public double calculaImposto(double subtotal, Categorias categorias){

        switch(categorias) {
            case ALIMENTOS:
                impostoPercent = 0.10;
                break;
            case ROUPAS:
                impostoPercent = 0.12;
                break;
            case ELETRONICOS:
                impostoPercent = 0.20;
                break;
            case ALCOOLICOS:
                impostoPercent = 0.16;
                break;
            case BAZAR:
                impostoPercent = 0.14;
                break;
        }
        return subtotal * impostoPercent;
    }
}
