package com.bcopstein.Adaptadores.repositorios;

import java.util.List;

import com.bcopstein.Negocio.entidades.Venda;

import org.springframework.data.repository.CrudRepository;

public interface IVendaCRUD extends CrudRepository<Venda, Long> {
    List<Venda> findAll();
    Venda findByNumero(long numero);
}
