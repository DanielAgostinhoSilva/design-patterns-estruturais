package br.com.design.pattern.observer.orcamento.situacao;

import br.com.design.pattern.proxy.orcamento.Orcamento;
import br.com.design.pattern.proxy.orcamento.situacao.Finalizado;
import br.com.design.pattern.proxy.orcamento.situacao.SituacaoOrcamento;

public class Reprovado extends SituacaoOrcamento {

    @Override
    public void finalizar(Orcamento orcamento) {
        orcamento.setSituacao(new Finalizado());
    }
}
