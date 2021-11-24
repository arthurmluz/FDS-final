package com.bcopstein.Adaptadores.repositorios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bcopstein.Negocio.entidades.ItemEstoque;
import com.bcopstein.Negocio.repositorios.EstoqueRepository;

@Component
public class EstoqueRepImpl implements EstoqueRepository {
    private IEstoqueCRUD estoqueCRUD;

    @Autowired
    public EstoqueRepImpl(IEstoqueCRUD estoqueCRUD){
        this.estoqueCRUD = estoqueCRUD;
    }


    public List<ItemEstoque> todos(){
        List<ItemEstoque> resp = IEstoqueCRUD.findAll();
        return resp;
    }

    public ItemEstoque procura(ItemEstoque item){
        return IEstoqueCRUD.findById(item.getId());
    }
}