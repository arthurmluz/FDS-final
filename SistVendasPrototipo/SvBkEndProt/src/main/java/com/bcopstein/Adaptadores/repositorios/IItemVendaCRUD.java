package com.bcopstein.Adaptadores.repositorios;

import com.bcopstein.Negocio.entidades.ItemVenda;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IItemVendaCRUD extends CrudRepository<ItemVenda, Integer> {
   List<ItemVenda> findAll();
   ItemVenda findById(int id);
   ItemVenda findByCodProduto(int codProduto);
}
