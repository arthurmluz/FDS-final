package com.bcopstein.Negocio.servicos;

import java.util.List;

import com.bcopstein.Negocio.entidades.Venda;
import com.bcopstein.Negocio.repositorios.VendaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServicoDeVenda {
    public VendaRepository vendaRep;

    @Autowired
    public ServicoDeVenda(VendaRepository vendaRep){
        this.vendaRep = vendaRep;
    }

    public List<Venda> todos(){
        return vendaRep.todos();
    }

    public Venda recupera(int numero){
        return vendaRep.recupera(numero);
    }

    public boolean cadastraVenda(Venda venda){
         return vendaRep.cadastra(venda);
    }

}