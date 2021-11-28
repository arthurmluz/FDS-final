package com.bcopstein.Negocio.servicos;

import java.util.List;

import com.bcopstein.Negocio.entidades.Produto;
import com.bcopstein.Negocio.repositorios.ProdutosRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServicoDeProduto {
    public ProdutosRepository produtoRep;

    @Autowired
    public ServicoDeProduto(ProdutosRepository produtoRep){
        this.produtoRep = produtoRep;
    }

    public List<Produto> todos(){
        return produtoRep.todos();
    }

    public boolean cadastraProduto(Produto produto){
         return produtoRep.cadastra(produto);
    }

    public Produto procura(int cod){
        return produtoRep.procura(cod);
    }
}