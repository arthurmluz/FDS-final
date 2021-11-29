package com.bcopstein.Aplicacao.dtos;

import java.util.List;

public class GerencialDTO {
    private double valorEstoque;
    private double valorTotalVendas;
    private List<String> relatorio;

   public GerencialDTO(double valorEstoque, double valorTotalVendas, List<String> relatorio) {
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

    public List<String> getRelatorio() {
        return relatorio;
    }

    public void setRelatorio(List<String> relatorio) {
        this.relatorio = relatorio;
    }
}
