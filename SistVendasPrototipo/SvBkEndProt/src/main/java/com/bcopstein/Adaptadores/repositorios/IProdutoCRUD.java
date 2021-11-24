package com.bcopstein.Adaptadores.repositorios;

import java.util.List;

import com.bcopstein.Negocio.entidades.Produto;

import org.springframework.data.repository.CrudRepository;

public interface IProdutoCRUD extends CrudRepository<Produto, Integer> {
    List<Produto> findAll();
    List<Produto> findByCodigo(int code);
}
