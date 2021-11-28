package com.bcopstein.Negocio.servicos;

import com.bcopstein.Negocio.entidades.ItemVenda;
import com.bcopstein.Negocio.repositorios.ItemVendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ServicoDeItemVenda {
    public ItemVendaRepository itemVendaRep;

    @Autowired
    public ServicoDeItemVenda(ItemVendaRepository itemVendaRep){
        this.itemVendaRep = itemVendaRep;
    }

    public List<ItemVenda> todos(){
        return itemVendaRep.todos();
    }

    public ItemVenda procura(int id){
        return itemVendaRep.procura(id);
    }

    public boolean cadastra(ItemVenda item){
        return itemVendaRep.cadastra(item);
    }

    public ItemVenda procuraPorCod(int codProduto){
        return itemVendaRep.procuraPorCodProduto(codProduto);
    }
}
