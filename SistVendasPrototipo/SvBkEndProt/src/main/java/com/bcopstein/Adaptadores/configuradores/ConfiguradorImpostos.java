package com.bcopstein.Adaptadores.configuradores;

import com.bcopstein.Aplicacao.servicos.impostos.ICalculoImposto;
import com.bcopstein.Aplicacao.servicos.impostos.ImpostoBrasil;
import com.bcopstein.Aplicacao.servicos.impostos.ImpostoEspanha;
import com.bcopstein.Aplicacao.servicos.impostos.ImpostoUSA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class ConfiguradorImpostos {

    @Autowired
    public ConfiguradorImpostos() {
    }

    @Bean
    @ConditionalOnProperty(name = "calculo.imposto", havingValue = "Brasil", matchIfMissing = true)
    public ICalculoImposto impostoBrasil() {
        return new ImpostoBrasil();
    }

    @Bean
    @ConditionalOnProperty(name = "calculo.imposto", havingValue = "USA")
    public ICalculoImposto impostoUSA() {
        return new ImpostoUSA();
    }

    @Bean
    @ConditionalOnProperty(name = "calculo.imposto", havingValue = "Espanha")
    public ICalculoImposto impostoEspanha() {
        return new ImpostoEspanha();
    }
}
