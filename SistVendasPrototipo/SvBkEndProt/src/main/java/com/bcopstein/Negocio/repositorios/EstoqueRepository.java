package com.bcopstein.Negocio.repositorios;

import java.util.List;

import com.bcopstein.Negocio.entidades.ItemEstoque;

public interface EstoqueRepository{
    // precisamos ler o universo de discurso pra saber oq mais fazer
    List<ItemEstoque> todos();
    boolean cadastra(ItemEstoque item);
    ItemEstoque procura(int id);
    void insereEstoque(int codProd, int qtd);
    void removeEstoque(int codProd, int qtd);
}
