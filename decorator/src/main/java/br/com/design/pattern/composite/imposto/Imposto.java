package br.com.design.pattern.observer.imposto;

import br.com.design.pattern.observer.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class Imposto {

	private Imposto outro;

	public Imposto(Imposto outro) {
		this.outro = outro;
	}

	protected abstract BigDecimal realizarCalculo(Orcamento orcamento);

	public BigDecimal calcular(Orcamento orcamento) {
		BigDecimal valorImposoto = realizarCalculo(orcamento);
		BigDecimal valorDoOutroImposto = BigDecimal.ZERO;

		if (outro != null) {
			valorDoOutroImposto = outro.realizarCalculo(orcamento);
		}

		return valorImposoto.add(valorDoOutroImposto);
	}

}
