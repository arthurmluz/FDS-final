package com.bcopstein.Negocio.entidades;

import com.bcopstein.Negocio.Categorias;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Produto {
    @Id 
    private int codigo;
    private String descricao;
    private double preco;
    private Categorias categoria;

    public Produto(int codigo, String descricao, Categorias categoria, double preco) {
      this.codigo = codigo;
      this.descricao = descricao;
      this.preco = preco;
      this.categoria = categoria;
    }

    protected Produto(){}

    public int getCodigo() {
      return codigo;
    }

    public Categorias getCategoria() {
        return categoria;
    }

    public void setCategoria(Categorias categoria) {
        this.categoria = categoria;
    }

    public String getDescricao() {
      return descricao;
    }

    public double getPreco() {
      return preco;
    }

    public void setCodigo(int codigo){
        this.codigo = codigo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setPreco(double preco) {
      this.preco = preco;
    }

    @Override
    public String toString() {
      return "Produto [codigo=" + codigo + ", descricao=" + descricao + ", preco=" + preco
          +  "]";
    }


}
