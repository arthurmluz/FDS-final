package com.bcopstein.Negocio.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class ItemEstoque{
    @Id
    private int id;
    private int quantidadeDisponivel;
    private int codProduto;

    public ItemEstoque(int id, int quantidade_Disponivel, int codProduto){
        this.id = id;
        this.quantidadeDisponivel = quantidade_Disponivel;
        this.codProduto = codProduto;
    }

    protected ItemEstoque(){}

    public int getQuantidadeDisponivel(){
        return this.quantidadeDisponivel;
    }

    public int getCodProduto(){
        return codProduto;
    }

    public long getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setQuantidadeDisponivel(int quantidadeDisponivel){
        this.quantidadeDisponivel = quantidadeDisponivel;
    }

    public void setCodProduto(int codProduto){
        this.codProduto = codProduto;
    }

    @Override
    public String toString() {
        return "ItemEstoque{" +
                "id=" + id +
                ", quantidadeDisponivel=" + quantidadeDisponivel +
                ", codProduto=" + codProduto +
                '}';
    }
}