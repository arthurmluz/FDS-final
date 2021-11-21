package com.bcopstein.Adaptadores.repositorios;

import java.util.List;

import com.bcopstein.Negocio.entidades.Produto;

import org.springframework.data.repository.CrudRepository;

public interface IProdutoCRUD extends CrudRepository<Produto,String> {
    List<Produto> findAll();
    List<Produto> findByCode(String code);
}
