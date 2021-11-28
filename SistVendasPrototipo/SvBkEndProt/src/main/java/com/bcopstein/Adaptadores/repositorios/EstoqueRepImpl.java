package com.bcopstein.Adaptadores.repositorios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

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
        List<ItemEstoque> resp = estoqueCRUD.findAll();
        return resp;
    }

    public ItemEstoque procura(int codigo){
        return estoqueCRUD.findById(codigo);
    }


    @Override
    public boolean cadastra(ItemEstoque item) {
        estoqueCRUD.save(item);
        return true;
    }


}