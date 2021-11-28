package com.bcopstein.Negocio.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity

public class ItemEstoque{
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private int quantidadeDisponivel;
    private int codProduto;

    public ItemEstoque(int quantidade_Disponivel, int codProduto){
        this.quantidadeDisponivel = quantidade_Disponivel;
        this.codProduto = codProduto;
    }

    protected ItemEstoque(){}

    public int getQuantidadeDisponivel(){
        return quantidadeDisponivel;
    }

    public int getCodProduto(){
        return codProduto;
    }

    public long getId(){
        return id;
    }

    public void setId(Long id){
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