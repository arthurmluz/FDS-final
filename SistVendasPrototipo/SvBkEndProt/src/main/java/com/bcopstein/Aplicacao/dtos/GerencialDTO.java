package com.bcopstein.Aplicacao.dtos;

public class GerencialDTO {
    private double valorEstoque;
    private double valorTotalVendas;
    private StringBuilder relatorio;

   public GerencialDTO(double valorEstoque, double valorTotalVendas, StringBuilder relatorio) {
        this.valorEstoque = valorEstoque;
        this.valorTotalVendas = valorTotalVendas;
        this.relatorio = relatorio;
   }

    public double getValorEstoque() {
        return valorEstoque;
    }

    public void setValorEstoque(double valorEstoque) {
        this.valorEstoque = valorEstoque;
    }

    public double getValorTotalVendas() {
        return valorTotalVendas;
    }

    public void setValorTotalVendas(double valorTotalVendas) {
        this.valorTotalVendas = valorTotalVendas;
    }

    public StringBuilder getRelatorio() {
        return relatorio;
    }

    public void setRelatorio(StringBuilder relatorio) {
        this.relatorio = relatorio;
    }
}
