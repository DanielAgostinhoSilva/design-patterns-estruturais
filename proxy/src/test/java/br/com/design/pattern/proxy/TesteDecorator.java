package br.com.design.pattern.proxy;

import br.com.design.pattern.proxy.imposto.CalculadoraDeImpostos;
import br.com.design.pattern.proxy.imposto.ICMS;
import br.com.design.pattern.proxy.imposto.ISS;
import br.com.design.pattern.proxy.orcamento.Orcamento;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

@Log4j2
@SpringBootTest
class TesteDecorator {

    @Test
    public void deve_calcular_multiplos_impostos() {
        Orcamento orcamento = new Orcamento(new BigDecimal("600"), 4);
        CalculadoraDeImpostos calculadoraDeImpostos = new CalculadoraDeImpostos();
        log.info(calculadoraDeImpostos.calcular(orcamento, new ISS(new ICMS(null))));
    }

}
