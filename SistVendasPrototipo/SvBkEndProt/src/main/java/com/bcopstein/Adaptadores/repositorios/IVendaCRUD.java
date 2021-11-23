package com.bcopstein.Adaptadores.repositorios;

import java.util.List;

import com.bcopstein.Negocio.entidades.Produto;

import org.springframework.data.repository.CrudRepository;

public interface IVendaCRUD extends CrudRepository<Venda,long> {
    List<Produto> findAll();
    List<Produto> findByNumero(long numero);
}
