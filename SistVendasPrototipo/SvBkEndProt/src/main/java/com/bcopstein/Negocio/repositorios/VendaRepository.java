package com.bcopstein.Negocio.repositorios;

import java.util.List;

import com.bcopstein.Negocio.Venda;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public interface VendaRepository{
    // precisamos ler o universo de discurso pra saber oq mais fazer
    List<Venda> todos();
    Venda recupera(int numero);
    void cadastra(Venda venda);
    void removeTodos();
}