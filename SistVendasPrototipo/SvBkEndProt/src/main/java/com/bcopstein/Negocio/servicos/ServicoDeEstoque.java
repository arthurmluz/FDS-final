package com.bcopstein.Negocio.servicos;

import java.util.List;

import com.bcopstein.Negocio.entidades.ItemEstoque;
import com.bcopstein.Negocio.repositorios.EstoqueRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServicoDeEstoque {
    public EstoqueRepository estoqueRep;

    @Autowired
    public ServicoDeEstoque(EstoqueRepository estoqueRep){
        this.estoqueRep = estoqueRep;
    }

    public List<ItemEstoque> todos(){
        return estoqueRep.todos();
    }

    public ItemEstoque procura(int id){
        return estoqueRep.procura(id);
    }

    public void cadastra(ItemEstoque item ){
        estoqueRep.cadastra(item);
    }

}