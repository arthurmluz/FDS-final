package com.bcopstein.Negocio.repositorios;

import java.util.List;

import com.bcopstein.Negocio.entidades.ItemEstoque;

public interface EstoqueRepository{
    // precisamos ler o universo de discurso pra saber oq mais fazer
    List<ItemEstoque> todos();
    boolean cadastra(ItemEstoque item);
    ItemEstoque procura(int id);
    ItemEstoque procuraPorCodProduto(int codProd);
    boolean insereEstoque(int id, int codProd, int qtd);
    boolean removeEstoque(ItemEstoque item, int quantidade);
}
