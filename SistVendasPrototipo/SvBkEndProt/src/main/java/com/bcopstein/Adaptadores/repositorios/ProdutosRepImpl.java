package com.bcopstein.Adaptadores.repositorios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

import com.bcopstein.Negocio.entidades.Produto;
import com.bcopstein.Negocio.repositorios.ProdutosRepository;

@Component
public class ProdutosRepImpl implements ProdutosRepository {
    private IProdutoCRUD produtoCRUD;

    @Autowired
    public ProdutosRepImpl(IProdutoCRUD produtoCRUD){
        this.produtoCRUD = produtoCRUD;
    }


    public List<Produto> todos(){
        List<Produto> resp = produtoCRUD.findAll();
        return resp;
    }

    public boolean cadastra(Produto produto){
        produtoCRUD.save(produto);
        return true;
    }


    @Override
    public void removeTodos() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public Produto procura(int cod) {
        return produtoCRUD.findByCodigo(cod);
    }
}