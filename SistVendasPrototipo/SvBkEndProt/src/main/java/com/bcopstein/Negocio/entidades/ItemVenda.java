package com.bcopstein.Negocio;

public class ItemVenda {
    private int quantidade;
    private int precoUnitVenda;
    private long imposto;

    public ItemVenda(int quantidade, int precoUnitVenda, long imposto){
        this.quantidade = quantidade;
        this.precoUnitVenda = precoUnitVenda;
        this.imposto = imposto;
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