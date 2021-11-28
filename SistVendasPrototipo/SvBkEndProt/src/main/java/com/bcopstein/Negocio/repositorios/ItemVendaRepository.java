package com.bcopstein.Negocio.repositorios;

import com.bcopstein.Negocio.entidades.ItemVenda;

import java.util.List;

public interface ItemVendaRepository {
    List<ItemVenda> todos();
    boolean cadastra(ItemVenda item);
    ItemVenda procura(int id);
    ItemVenda procuraPorCodProduto(int codProd);
}
