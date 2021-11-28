package com.bcopstein.Negocio.repositorios;

import java.util.List;

import com.bcopstein.Negocio.entidades.Venda;

public interface VendaRepository{
    // precisamos ler o universo de discurso pra saber oq mais fazer
    List<Venda> todos();
    Venda recupera(int numero);
    boolean cadastra(Venda venda);
    void removeTodos();
}