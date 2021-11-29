package com.bcopstein.Adaptadores.controllers;


import com.bcopstein.Adaptadores.dtos.ItemCarrinho;
import com.bcopstein.Aplicacao.UseCases.UC_Estoque.UC_ConsultaEstoque;
import com.bcopstein.Aplicacao.UseCases.UC_Estoque.UC_ConsultaGerencia;
import com.bcopstein.Aplicacao.UseCases.UC_Estoque.UC_InsereEstoque;
import com.bcopstein.Aplicacao.UseCases.UC_Estoque.UC_RemoveEstoque;
import com.bcopstein.Aplicacao.dtos.GerencialDTO;
import com.bcopstein.Negocio.entidades.ItemEstoque;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estoque")
public class EstoqueController {
    private UC_InsereEstoque insereEstoque;
    private UC_ConsultaEstoque consultaEstoque;
    private UC_RemoveEstoque removeEstoque;
    private UC_ConsultaGerencia consultaGerencia;

    @Autowired
    public EstoqueController(UC_InsereEstoque insereEstoque,
                             UC_ConsultaEstoque consultaEstoque,
                             UC_RemoveEstoque removeEstoque,
                             UC_ConsultaGerencia consultaGerencia){
        this.insereEstoque = insereEstoque;
        this.consultaEstoque = consultaEstoque;
        this.removeEstoque = removeEstoque;
        this.consultaGerencia = consultaGerencia;
    }

    @GetMapping("/listagem")
    @CrossOrigin(origins = "*")
    public List<ItemEstoque> listaEstoque(){
        return consultaEstoque.todos();
    }

   @PostMapping("/insere")
   @CrossOrigin(origins = "*")
   public boolean insereEstoque(@RequestBody final ItemCarrinho item){
        return insereEstoque.run(item.getQuantidade(), item.getCodigo());
   }

   @DeleteMapping("/remove")
    @CrossOrigin(origins = "*")
    public boolean removeEstoque(@RequestBody final ItemCarrinho item){
        return removeEstoque.run(item.getQuantidade(), item.getCodigo());
   }

    @GetMapping("/gerencial")
    @CrossOrigin(origins = "*")
    public GerencialDTO gerencial(){
        return consultaGerencia.run();
    }
}
