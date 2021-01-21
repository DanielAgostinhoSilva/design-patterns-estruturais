package br.com.design.pattern.composite;

import br.com.design.pattern.composite.imposto.CalculadoraDeImpostos;
import br.com.design.pattern.composite.imposto.ICMS;
import br.com.design.pattern.composite.imposto.ISS;
import br.com.design.pattern.composite.orcamento.ItemOrcamento;
import br.com.design.pattern.composite.orcamento.Orcamento;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

@Log4j2
@SpringBootTest
class TesteComposite {

    @Test
    public void deve_calcular_multiplos_impostos() {
        Orcamento antigo = new Orcamento();
        antigo.adicionarItem(new ItemOrcamento(new BigDecimal("200")));
        antigo.reprovar();

        Orcamento novo = new Orcamento();
        novo.adicionarItem(new ItemOrcamento(new BigDecimal("500")));
        novo.adicionarItem(antigo);

        log.info("Orcamento antigo: {}, Orcamento novo: {}", antigo.getValor(), novo.getValor() );
    }

}
