package com.bcopstein.Adaptadores.repositorios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bcopstein.Negocio.entidades.Produto;
import com.bcopstein.Negocio.repositorios.ProdutosRepository;

@Component
public class ProdutosRepImpl implements ProdutosRepository {
    private IProdutosCRUD produtoCRUD;

    @Autowired
    public ProdutosRepImpl(IProdutosCRUD produtoCRUD){
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
}