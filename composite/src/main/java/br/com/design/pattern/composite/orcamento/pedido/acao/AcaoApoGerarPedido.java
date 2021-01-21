package br.com.design.pattern.composite.orcamento.pedido.acao;

import br.com.design.pattern.composite.orcamento.pedido.Pedido;

public interface AcaoApoGerarPedido {
    void executarAcao(Pedido pedido);
}
