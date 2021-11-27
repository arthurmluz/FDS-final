package com.bcopstein.Adaptadores.controllers;

import java.util.ArrayList;
import java.util.List;

import com.bcopstein.Aplicacao.*;
import com.bcopstein.Negocio.entidades.ItemVenda;
import com.bcopstein.Negocio.entidades.Produto;

import com.bcopstein.Negocio.entidades.Venda;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vendas")
public class Controller {
  private UC_EfetivarVenda efetivarVenda;
  private UC_SelecionarProduto selecionarProduto;
  private UC_ConsultaProdutos consultaProdutos;
  private UC_CadastraProduto cadastraProduto;
  private UC_ConsultaVendas consultaVendas;

  @Autowired
  public Controller(UC_EfetivarVenda efetivarVenda,
                    UC_SelecionarProduto selecionarProduto,
                    UC_CadastraProduto cadastraProduto, UC_ConsultaProdutos consultaProdutos,
                    UC_ConsultaVendas consultaVendas) {
    this.efetivarVenda = efetivarVenda;
    this.selecionarProduto = selecionarProduto;
    this.consultaProdutos = consultaProdutos;
    this.cadastraProduto = cadastraProduto;
    this.consultaVendas = consultaVendas;
  }

  @GetMapping("/produtos")
  @CrossOrigin(origins = "*")
  public List<Produto> listaProdutos() {
    return consultaProdutos.run();
  }

  @PostMapping("/produtos")
  @CrossOrigin(origins = "*")
  public boolean cadastraProduto(@RequestBody final Produto produto) {
    cadastraProduto.run(produto);
    return true;
  }

  @GetMapping("/autorizacao")
  @CrossOrigin(origins = "*")
  public boolean podeVender(@RequestParam final Integer codProd,
                            @RequestParam final Integer qtdade) {
    return selecionarProduto.run(codProd, qtdade);
  }

  @PostMapping("/confirmacao")
  @CrossOrigin(origins = "*")
  public boolean confirmaVenda(@RequestBody final ItemVenda[] carrinho)
  {
      return efetivarVenda.run();
  }

  @GetMapping("/historico")
  @CrossOrigin(origins = "*")
  public List<Venda> vendasEfetuadas() {
    return consultaVendas.run();
  }


}


  //@PostMapping("/subtotal")
  //@CrossOrigin(origins = "*")
  //public Integer[] calculaSubtotal(@RequestBody final ItemCarrinho[] itens) {
  //  Integer subtotal = 0;
  //  Integer imposto = 0;

  //  for (final ItemCarrinho it : itens) {
  //    // Procurar o produto pelo código
  //    final Produto prod =
  //        produtos.stream().filter(p -> p.getCodigo() == it.getCodigo()).findAny().orElse(null);

  //    if (prod != null) {
  //      subtotal += (int) (prod.getPreco() * it.getQuantidade());
  //    } else {
  //      throw new IllegalArgumentException("Codigo invalido");
  //    }
  //  }
  //  imposto = (int) (subtotal * 0.1);
  //  final Integer[] resp = new Integer[3];
  //  resp[0] = subtotal;
  //  resp[1] = imposto;
  //  resp[2] = subtotal + imposto;
  //  return resp;
  //}}
