package br.com.design.pattern.observer;

import br.com.design.pattern.observer.http.JavaHttpClient;
import br.com.design.pattern.observer.orcamento.Orcamento;
import br.com.design.pattern.observer.orcamento.RegistroDeOrcamento;
import br.com.design.pattern.observer.orcamento.pedido.GeraPedido;
import br.com.design.pattern.observer.orcamento.pedido.GeraPedidoHandler;
import br.com.design.pattern.observer.orcamento.pedido.Pedido;
import br.com.design.pattern.observer.orcamento.pedido.acao.EnviarEmailPedido;
import br.com.design.pattern.observer.orcamento.pedido.acao.SalvarPedidoNoBancoDeDados;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Arrays;

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
