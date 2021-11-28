package com.bcopstein.Adaptadores.controllers;


import com.bcopstein.Adaptadores.dtos.ItemCarrinho;
import com.bcopstein.Aplicacao.UC_ConsultaEstoque;
import com.bcopstein.Aplicacao.UC_InsereEstoque;
import com.bcopstein.Negocio.entidades.ItemEstoque;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estoque")
public class EstoqueController {
    private UC_InsereEstoque insereEstoque;
    private UC_ConsultaEstoque consultaEstoque;

    Logger logger = LoggerFactory.getLogger(LoggingController.class);

    @Autowired
    public EstoqueController(UC_InsereEstoque insereEstoque, UC_ConsultaEstoque consultaEstoque){
        this.insereEstoque = insereEstoque;
        this.consultaEstoque = consultaEstoque;
    }

    @GetMapping("/listagem")
    @CrossOrigin(origins = "*")
    public List<ItemEstoque> listaEstoque(){
        return consultaEstoque.todos();
    }

   @PostMapping("/insere")
   @CrossOrigin(origins = "*")
   public boolean insereEstoque(@RequestBody final ItemCarrinho item){
        logger.info("Howdy");
        return insereEstoque.run(item.getQuantidade(), item.getCodigo());
   }
}
