package com.bcopstein.Negocio.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ItemVenda {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private int quantidade;
    private int codProduto;
    private int precoUnitVenda;
    private long imposto;

    public ItemVenda(int quantidade, int codProduto){
        this.quantidade = quantidade;
        this.codProduto = codProduto;
    }

    protected ItemVenda(){}

    public int getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(int codProduto) {
        this.codProduto = codProduto;
    }

    public int getQuantidade(){
        return quantidade;
    }

    public int getPrecoUnitVenda(){
        return precoUnitVenda;
    }

    public long getImposto(){
        return imposto;
    }

    public void setImposto(long imposto){
        this.imposto = imposto;
    }

    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }

    public void setPrecoUnitVenda(int precoUnitVenda){
        this.precoUnitVenda = precoUnitVenda;
    }


    @Override
    public String toString() {
      return "Item Venda [quantidade=" + quantidade + ", preço unitário=" + precoUnitVenda + ", imposto=" + imposto+ "]";
    }
}