package com.bcopstein.Negocio.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ItemVenda {

    @Id
    private int id;
    private int quantidade;
    private int codProduto;
    private double precoUnitVenda;

    public ItemVenda(int id, int quantidade, int codProduto, double precoUnitVenda){
        this.id = id;
        this.quantidade = quantidade;
        this.codProduto = codProduto;
        this.precoUnitVenda = precoUnitVenda;
    }
    protected ItemVenda(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPrecoUnitVenda(double precoUnitVenda) {
        this.precoUnitVenda = precoUnitVenda;
    }

    public int getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(int codProduto) {
        this.codProduto = codProduto;
    }

    public int getQuantidade(){
        return quantidade;
    }

    public double getPrecoUnitVenda(){
        return precoUnitVenda;
    }

    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }

    public void setPrecoUnitVenda(int precoUnitVenda){
        this.precoUnitVenda = precoUnitVenda;
    }


    @Override
    public String toString() {
      return "Item Venda [quantidade=" + quantidade + ", preço unitário=" + precoUnitVenda;
    }
}