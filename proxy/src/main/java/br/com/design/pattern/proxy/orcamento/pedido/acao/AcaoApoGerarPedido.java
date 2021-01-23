package br.com.design.pattern.proxy.orcamento.pedido.acao;

import br.com.design.pattern.proxy.orcamento.pedido.Pedido;

public interface AcaoApoGerarPedido {
    void executarAcao(Pedido pedido);
}
