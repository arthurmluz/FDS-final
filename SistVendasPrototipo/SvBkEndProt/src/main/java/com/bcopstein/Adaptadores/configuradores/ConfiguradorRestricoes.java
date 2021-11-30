package com.bcopstein.Adaptadores.configuradores;

import com.bcopstein.Aplicacao.servicos.restricoes.IRestricoes;
import com.bcopstein.Aplicacao.servicos.restricoes.RestricaoCarrinho;
import com.bcopstein.Aplicacao.servicos.restricoes.RestricaoProdutos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfiguradorRestricoes {

    @Autowired
    public ConfiguradorRestricoes(){
    }

    @Bean
    @ConditionalOnProperty(name = "restricao", havingValue = "carrinho", matchIfMissing = true)
    public IRestricoes restricaoCarrinho(){ return new RestricaoCarrinho(); }

    @Bean
    @ConditionalOnProperty(name = "restricao", havingValue = "produtos")
    public IRestricoes restricaoProdutos(){ return new RestricaoProdutos(); }

}
