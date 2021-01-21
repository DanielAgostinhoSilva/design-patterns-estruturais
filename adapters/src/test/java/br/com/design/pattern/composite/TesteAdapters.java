package br.com.design.pattern.composite;

import br.com.design.pattern.composite.http.JavaHttpClient;
import br.com.design.pattern.composite.orcamento.Orcamento;
import br.com.design.pattern.composite.orcamento.RegistroDeOrcamento;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

@SpringBootTest
class TesteAdapters {

    @Test
    public void deve_registrar_um_orcamento() {
        Orcamento orcamento = new Orcamento(new BigDecimal("600"), 4);
        orcamento.aprovar();
        orcamento.finalizar();

        RegistroDeOrcamento registroDeOrcamento = new RegistroDeOrcamento(new JavaHttpClient());
        registroDeOrcamento.registrar(orcamento);
    }

}
