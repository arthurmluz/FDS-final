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
    private double imposto;
    private double total;

    @OneToMany
    private List<ItemVenda> produtos;

    public Venda(Date data, ArrayList<ItemVenda> produtos, double total, double imposto){
        this.data = data;
        this.produtos = produtos;
    }

    protected Venda(){}

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    public void setProdutos(List<ItemVenda> produtos) {
        this.produtos = produtos;
    }

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