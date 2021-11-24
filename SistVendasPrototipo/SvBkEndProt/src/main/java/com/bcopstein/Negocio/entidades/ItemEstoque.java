package com.bcopstein.Negocio.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ItemEstoque{
    @Id
    private int id;
    private int quantidadeDisponivel;
    private int codProduto;

    public ItemEstoque(int qtdDisponivel, int codProduto){
        this.quantidadeDisponivel = qtdDisponivel;
        this.codProduto = codProduto;
    }

    protected ItemEstoque(){}

    public int getQuantidadeDisponivel(){
        return quantidadeDisponivel;
    }

    public int getCodProduto(){
        return codProduto;
    }

    public int getId(){
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

    // nao sei se seria necessario
    public boolean diminuiProduto(){
        if( quantidadeDisponivel >= 1){
            quantidadeDisponivel -=1;
            return true;
        }
        return false;
    }
}