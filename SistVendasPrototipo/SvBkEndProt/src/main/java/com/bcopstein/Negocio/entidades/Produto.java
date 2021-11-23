package com.bcopstein.Negocio.entidades;

import javax.persistence.Entity;
import javaax.persistence.Id;

@Entity
public class Produto {
    @Id 
    private int codigo;
    private String descricao;
    private double preco;
    private int qtdade;

    public Produto(int codigo, String descricao, double preco, int qtdade) {
      this.codigo = codigo;
      this.descricao = descricao;
      this.preco = preco;
      this.qtdade = qtdade;
    }

    protected Produto(){}

    public int getCodigo() {
      return codigo;
    }

    public String getDescricao() {
      return descricao;
    }

    public double getPreco() {
      return preco;
    }

    public int getQtdade() {
      return qtdade;
    }

    public void saidaDeProduto(int qtdade) {
      this.qtdade -= qtdade;
    }

    public void setCodigo(int codigo){
        this.codigo = codigo;
    }

    public void setDescricao() {
        this.descricao = descricao;
    }

    public void setPreco(double preco) {
      this.preco = preco;
    }

    public void setQtdade(int qtdade){
        this.qtdade = qtdade;
    }

    @Override
    public String toString() {
      return "Produto [codigo=" + codigo + ", descricao=" + descricao + ", preco=" + preco
          + ", qtdade=" + qtdade + "]";
    }


}
