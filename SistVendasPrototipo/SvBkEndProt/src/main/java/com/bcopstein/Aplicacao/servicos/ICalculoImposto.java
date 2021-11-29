package com.bcopstein.Aplicacao.servicos;

import com.bcopstein.Negocio.Categorias;
public interface ICalculoImposto {
    double calculaImposto(double valor,Categorias categorias);
}
