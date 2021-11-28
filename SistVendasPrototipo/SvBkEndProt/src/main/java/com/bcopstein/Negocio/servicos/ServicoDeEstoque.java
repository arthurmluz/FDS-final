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

    public boolean cadastra(ItemEstoque item ){
        return estoqueRep.cadastra(item);
    }

    public boolean insere(int id, int qtd, int codProduto){
        return estoqueRep.insereEstoque(id, codProduto, qtd);
   }

    public void remove(int qtd, int codProduto){
        estoqueRep.removeEstoque(codProduto, qtd);
    }
}