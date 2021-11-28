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
    public void insereEstoque(int codProd, int qtd) {
        ItemEstoque item = procura(codProd);
        if( item == null ){
            item = new ItemEstoque(qtd, codProd);
            cadastra(item);
            return;
        }
        item.setQuantidadeDisponivel(item.getQuantidadeDisponivel()+qtd);
    }

    @Override
    public void removeEstoque(int codProd, int qtd) {
        ItemEstoque item = procura(codProd);
        if( item == null )
            return;
        if( item.getQuantidadeDisponivel() >= qtd )
            item.setQuantidadeDisponivel(item.getQuantidadeDisponivel()-qtd);
    }


    @Override
    public boolean cadastra(ItemEstoque item) {
        estoqueCRUD.save(item);
        return true;
    }


}