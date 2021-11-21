package com.bcopstein.Negocio.servicos;

import java.util.List;

import com.bcopstein.Negocio.entidades.Produto;
import com.bcopstein.Negocio.repositorios.ProdutoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServicoDeProduto {
    public ProdutoRepository produtoRep;

    @Autowired
    public ServicoDeProduto(ProdutoRepository produtoRep){
        this.produtoRep = produtoRep;
    }

    public List<Produto> todos(){
        return produtoRep.todos();
    }

    public void cadastraProduto(Produto produto){
        produtoRep.cadastra(produto);
    }   
}