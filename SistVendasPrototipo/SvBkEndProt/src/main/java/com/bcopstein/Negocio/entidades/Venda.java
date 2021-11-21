package com.bcopstein.Negocio.entidades;
import java.util.Date;

import com.bcopstein.Negocio.entidades.Produto;

public class Venda{

    private long numero;
    private Date data;

    public Venda(long numero, Date data){
        this.data = data;
        this.numero = numero;
    }

    public long getNumero(){
        return numero;
    }

    public Date getData(){
        return data;
    }


    // não sei bem fazer esse método
    public int Subtotal(Produto prod){
        Integer subtotal = 0;
        Integer imposto = 0;

        subtotal =  prod.getPreco() * prod.getQtdade();
        subtotal = subtotal * imposto; // criar classes para imposto, sao 3 diferentes (país 1 = 12% de imposto / país 2 = 15% de imposto para compras de até 8000$ e 20% para os valores que excedem essa faixa) 
        // subtotal = subtotal * impostos()
        return subtotal;
    }
}