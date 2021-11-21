package com.bcopstein.Negocio.entidades;

public class ItemEstoque{
    private int quantidadeDisponivel;
    private Produto produto;

    public ItemEstoque(int qtdDisponivel, Produto prod){
        this.quantidadeDisponivel = qtdDisponivel;
        this.produto = prod;
    }

    public int getQuantidadeDisponivel(){
        return quantidadeDisponivel;
    }

    public Produto getProduto(){
        return produto;
    }

    public boolean diminuiProduto(){
        if( quantidadeDisponivel >= 1){
            quantidadeDisponivel -=1;
            return true;
        }
        return false;
    }
}