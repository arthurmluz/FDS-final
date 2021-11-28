package com.bcopstein.Negocio.entidades;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
public class Venda{
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long numero;
    private Date data;
    @OneToMany
    private List<ItemVenda> produtos;

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

    public List<ItemVenda> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<ItemVenda> produtos) {
        this.produtos = produtos;
    }
}