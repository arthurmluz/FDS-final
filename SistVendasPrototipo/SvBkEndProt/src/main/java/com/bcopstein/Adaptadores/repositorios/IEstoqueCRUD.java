package com.bcopstein.Adaptadores.repositorios;

import java.util.List;

import com.bcopstein.Negocio.entidades.ItemEstoque;

import org.springframework.data.repository.CrudRepository;

public interface IEstoqueCRUD extends CrudRepository<ItemEstoque, Integer> {
    List<ItemEstoque> findAll();
    ItemEstoque findById(int id);
    ItemEstoque findByCodProduto(int codProduto);
}