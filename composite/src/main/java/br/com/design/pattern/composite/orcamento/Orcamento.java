package br.com.design.pattern.composite.orcamento;

import br.com.design.pattern.composite.orcamento.situacao.EmAnalise;
import br.com.design.pattern.composite.orcamento.situacao.Finalizado;
import br.com.design.pattern.composite.orcamento.situacao.SituacaoOrcamento;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Orcamento implements Orcavel {
    private BigDecimal valor;
    private SituacaoOrcamento situacao;
    private List<Orcavel> itens;

    public Orcamento() {
        this.valor = BigDecimal.ZERO;
        this.situacao = new EmAnalise();
        this.itens = new ArrayList<>();
    }

    public void aplicarDescontoExtra() {
        BigDecimal valorDoDeescontoExtra = this.situacao.calcularValorDescontoExtra(this);
        this.valor = this.valor.subtract(valorDoDeescontoExtra);
    }

    public void aprovar() {
        this.situacao.aprovar(this);
    }

    public void reprovar() {
        this.situacao.reprovar(this);
    }

    public void finalizar() {
        this.situacao.finalizar(this);
    }

    public boolean isFinalizado() {
        return situacao instanceof Finalizado;
    }

    public void adicionarItem(Orcavel itemOrcamento) {
        this.valor = valor.add(itemOrcamento.getValor());
        this.itens.add(itemOrcamento);
    }

    public BigDecimal getValor() {
        return valor;
    }

    public SituacaoOrcamento getSituacao() {
        return situacao;
    }

    public List<Orcavel> getItens() {
        return itens;
    }

    public void setSituacao(SituacaoOrcamento situacao) {
        this.situacao = situacao;
    }

    public int getQuantidadeDeItens() {
        return itens.size();
    }
}
