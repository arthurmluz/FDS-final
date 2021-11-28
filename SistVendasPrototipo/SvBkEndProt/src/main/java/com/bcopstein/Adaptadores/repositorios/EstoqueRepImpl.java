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


    @Override
    public List<ItemEstoque> todos(){
        return estoqueCRUD.findAll();
    }

    @Override
    public ItemEstoque procura(int codigo){
        return estoqueCRUD.findById(codigo);
    }

    @Override
    public ItemEstoque procuraPorCodProduto(int codProd) {
        return estoqueCRUD.findByCodProduto(codProd);
    }

    @Override
    public boolean insereEstoque(int id, int codProd, int qtd) {
        ItemEstoque item = procuraPorCodProduto(codProd);

        if( item == null ){
            item = new ItemEstoque(id, qtd, codProd);
            cadastra(item);
            return true;
        }
        item.setQuantidadeDisponivel(item.getQuantidadeDisponivel() + qtd);
        estoqueCRUD.save(item);
        return true;
    }

    @Override
    public boolean removeEstoque(ItemEstoque item, int quantidade) {
        item.setQuantidadeDisponivel(item.getQuantidadeDisponivel()-quantidade);
        estoqueCRUD.save(item);
        return true;
    }


    @Override
    public boolean cadastra(ItemEstoque item) {
        estoqueCRUD.save(item);
        return true;
    }


}