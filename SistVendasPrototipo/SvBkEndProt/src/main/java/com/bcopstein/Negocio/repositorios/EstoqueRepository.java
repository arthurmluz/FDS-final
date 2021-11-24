package com.bcopstein.Negocio.repositorios;

import java.util.List;

import com.bcopstein.Negocio.entidades.Produto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public interface EstoqueRepository{
    // precisamos ler o universo de discurso pra saber oq mais fazer
    List<Produto> todos();
    boolean cadastra(Produto produto);
    void removeTodos();
    ItemEstoque procura(int id);
}
