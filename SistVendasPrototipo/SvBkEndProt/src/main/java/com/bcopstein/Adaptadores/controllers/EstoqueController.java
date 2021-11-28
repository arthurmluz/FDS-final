package com.bcopstein.Adaptadores.controllers;


import com.bcopstein.Aplicacao.UC_ConsultaEstoque;
import com.bcopstein.Aplicacao.UC_InsereEstoque;
import com.bcopstein.Negocio.entidades.ItemEstoque;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/estoque")
public class EstoqueController {
    private UC_InsereEstoque insereEstoque;
    private UC_ConsultaEstoque consultaEstoque;

    @Autowired
    public EstoqueController(UC_InsereEstoque insereEstoque){
        this.insereEstoque = insereEstoque;
    }

    @GetMapping("/estoque")
    @CrossOrigin(origins = "*")
    public List<ItemEstoque> listaEstoque(){
        return consultaEstoque.todos();
    }
}
