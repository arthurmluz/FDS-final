package com.bcopstein.Negocio.entidades;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Venda{
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long numero;
    private Date data;
    private ArrayList<ItemVenda> produtos;

    public Venda(Date data, ArrayList<ItemVenda> produtos){
        this.data = data;
        this.produtos = produtos;
    }

    protected Venda(){}

    public long getNumero() {
        return this.numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public Date getData() {
        return this.data;
    }

    public void setData(Date data) {
        this.data = data;
    }
}