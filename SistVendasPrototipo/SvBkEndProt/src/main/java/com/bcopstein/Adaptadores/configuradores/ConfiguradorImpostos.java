package com.bcopstein.Adaptadores.configuradores;

import com.bcopstein.Aplicacao.servicos.ICalculoImposto;
import com.bcopstein.Aplicacao.servicos.ImpostoBrasil;
import com.bcopstein.Aplicacao.servicos.ImpostoEspanha;
import com.bcopstein.Aplicacao.servicos.ImpostoUSA;
import com.bcopstein.Negocio.repositorios.VendaRepository;

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
/*
 @Configuration
 public class ConfiguradorCalculoEstatistica {
     private IEventoRepository eventoRep;

     @Autowired
     public ConfiguradorCalculoEstatistica(IEventoRepository eventoRep) {
         this.eventoRep = eventoRep;
     }

     @Bean
     @ConditionalOnProperty(name = "calculo.estatistica", havingValue = "original", matchIfMissing = true)
     public ICalculoEstatistica opcaoRegraClassica() {
         return new EstatisticaNormal(eventoRep);
     }

     @Bean
     @ConditionalOnProperty(name = "calculo.estatistica", havingValue = "desconsidera")
     public ICalculoEstatistica opcaoDesconsidera() {
         return new EstatisticaDesconsidera(eventoRep);
     }
 }
 */