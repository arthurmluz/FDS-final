package com.bcopstein.Negocio.repositorios;

import java.util.List;

import com.bcopstein.Negocio.entidades.ItemEstoque;

public interface EstoqueRepository{
    // precisamos ler o universo de discurso pra saber oq mais fazer
    List<ItemEstoque> todos();
    boolean cadastra(ItemEstoque item);
    void removeTodos();
    ItemEstoque procura(int id);
}
