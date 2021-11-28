package com.bcopstein.Adaptadores.repositorios;

import com.bcopstein.Negocio.entidades.ItemVenda;
import com.bcopstein.Negocio.repositorios.ItemVendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ItemVendaRepImpl implements ItemVendaRepository {
    private IItemVendaCRUD itemVendaCRUD;

    @Autowired
    public ItemVendaRepImpl(IItemVendaCRUD itemVendaCRUD){
        this.itemVendaCRUD = itemVendaCRUD;
    }

    @Override
    public List<ItemVenda> todos() {
        return itemVendaCRUD.findAll();
    }

    @Override
    public boolean cadastra(ItemVenda item) {
        itemVendaCRUD.save(item);
        return true;
    }

    @Override
    public ItemVenda procura(int id) {
        return itemVendaCRUD.findById(id);
    }

    @Override
    public ItemVenda procuraPorCodProduto(int codProd) {
        return itemVendaCRUD.findByCodProduto(codProd);
    }
}
