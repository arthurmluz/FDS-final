package com.bcopstein.Negocio.repositorios;

import java.util.List;

import com.bcopstein.Negocio.entidades.Produto;


public interface ProdutosRepository{
    // precisamos ler o universo de discurso pra saber oq mais fazer
    List<Produto> todos();
    boolean cadastra(Produto produto);
    void removeTodos();
}
