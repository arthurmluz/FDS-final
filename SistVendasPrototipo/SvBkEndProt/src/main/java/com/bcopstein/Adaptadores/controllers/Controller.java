package com.bcopstein.Adaptadores.controllers;

import java.time.LocalDateTime;
import java.util.List;

import com.bcopstein.Adaptadores.dtos.ItemCarrinho;
import com.bcopstein.Aplicacao.UseCases.UC_Produto.UC_CadastraProduto;
import com.bcopstein.Aplicacao.UseCases.UC_Produto.UC_ConsultaProdutos;
import com.bcopstein.Aplicacao.UseCases.UC_Produto.UC_SelecionarProduto;
import com.bcopstein.Aplicacao.UseCases.UC_Vendas.UC_CalculaSubTotal;
import com.bcopstein.Aplicacao.UseCases.UC_Vendas.UC_ConsultaVendas;
import com.bcopstein.Aplicacao.UseCases.UC_Vendas.UC_EfetivarVenda;
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
  private UC_CalculaSubTotal calculaSubTotal;

  @Autowired
  public Controller(UC_EfetivarVenda efetivarVenda,
                    UC_SelecionarProduto selecionarProduto,
                    UC_CadastraProduto cadastraProduto, UC_ConsultaProdutos consultaProdutos,
                    UC_ConsultaVendas consultaVendas,
                    UC_CalculaSubTotal calculaSubTotal) {

    this.efetivarVenda = efetivarVenda;
    this.selecionarProduto = selecionarProduto;
    this.consultaProdutos = consultaProdutos;
    this.cadastraProduto = cadastraProduto;
    this.consultaVendas = consultaVendas;
    this.calculaSubTotal = calculaSubTotal;
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
  public boolean confirmaVenda(@RequestBody final ItemCarrinho[] carrinho)  {
      return efetivarVenda.run(carrinho);
  }

  @GetMapping("/historico")
  @CrossOrigin(origins = "*")
  public List<Venda> vendasEfetuadas() {
    return consultaVendas.run();
  }

  @PostMapping("/subtotal")
  @CrossOrigin(origins = "*")
  public Double[] calculaSubTotal(@RequestBody final ItemCarrinho[] itens){
      return calculaSubTotal.run(itens);
  }

}