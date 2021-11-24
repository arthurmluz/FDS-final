package com.bcopstein.Adaptadores.repositorios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

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
        List<Venda> resp = IVendaCRUD.findAll();
        return resp;
    }

    public Venda recupera(int numero){
        return IVendaCRUD.findByNumero(venda.getId());
    }

    public void cadastra(Venda venda){
        IVendaCRUD.save(venda);
    }
}