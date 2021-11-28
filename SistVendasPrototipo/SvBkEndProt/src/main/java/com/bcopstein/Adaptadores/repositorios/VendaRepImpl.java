package com.bcopstein.Adaptadores.repositorios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

import com.bcopstein.Negocio.entidades.Venda;
import com.bcopstein.Negocio.repositorios.VendaRepository;

@Component
public class VendaRepImpl implements VendaRepository {
    private IVendaCRUD vendaCRUD;

    @Autowired
    public VendaRepImpl(IVendaCRUD vendaCRUD){
        this.vendaCRUD = vendaCRUD;
    }


    public List<Venda> todos(){
        List<Venda> resp = vendaCRUD.findAll();
        return resp;
    }

    public Venda recupera(int numero){
        return vendaCRUD.findByNumero(numero);
    }

    public boolean cadastra(Venda venda){
        vendaCRUD.save(venda);
        return true;
    }


    @Override
    public void removeTodos() {
        // TODO Auto-generated method stub
        
    }
}