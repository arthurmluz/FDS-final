//package com.bcopstein.Adaptadores.configuradores;
//
//import com.bcopstein.Negocio.repositorios.VendaRepository;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//
//@Configuration
//public class ConfiguradorImpostos{
//    //Talvez seja alguma outra coisa aqui
//    private algumainterfacerepositorio rep;
//
//    @Autowired
//    public ConfiguradorImpostos(algumainterfacerepositorio rep){
//        this.rep = rep;
//    }
//
//    @Bean
//    @ConditionalOnProperty(name = "calculo.imposto", havingValue = "Brasil", matchIfMissing = true)
//    public retornaAlgumaInterface impostoBrasil(){
//        return new CalculoImpostoBrasil(rep);
//    }
//
//    @Bean
//    @ConditionalOnProperty(name = "calculo.imposto", havingValue = "USA")
//    public retornaAlgumaInterface impostoUSA(){
//        return new CalculoImpostoUSA(rep);
//    }
//}

// @Configuration
// public class ConfiguradorCalculoEstatistica {
//     private IEventoRepository eventoRep;
// 
//     @Autowired
//     public ConfiguradorCalculoEstatistica(IEventoRepository eventoRep) {
//         this.eventoRep = eventoRep;
//     }
// 
//     @Bean
//     @ConditionalOnProperty(name = "calculo.estatistica", havingValue = "original", matchIfMissing = true)
//     public ICalculoEstatistica opcaoRegraClassica() {
//         return new EstatisticaNormal(eventoRep);
//     }
// 
//     @Bean
//     @ConditionalOnProperty(name = "calculo.estatistica", havingValue = "desconsidera")
//     public ICalculoEstatistica opcaoDesconsidera() {
//         return new EstatisticaDesconsidera(eventoRep);
//     }
// }