package br.com.design.pattern.observer;

import br.com.design.pattern.observer.http.JavaHttpClient;
import br.com.design.pattern.observer.imposto.CalculadoraDeImpostos;
import br.com.design.pattern.observer.imposto.ICMS;
import br.com.design.pattern.observer.imposto.ISS;
import br.com.design.pattern.observer.orcamento.Orcamento;
import br.com.design.pattern.observer.orcamento.RegistroDeOrcamento;
import br.com.design.pattern.observer.orcamento.pedido.GeraPedido;
import br.com.design.pattern.observer.orcamento.pedido.GeraPedidoHandler;
import br.com.design.pattern.observer.orcamento.pedido.Pedido;
import br.com.design.pattern.observer.orcamento.pedido.acao.EnviarEmailPedido;
import br.com.design.pattern.observer.orcamento.pedido.acao.SalvarPedidoNoBancoDeDados;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Arrays;

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
