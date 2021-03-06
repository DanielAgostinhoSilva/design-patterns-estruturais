package br.com.design.pattern.proxy.imposto;

import br.com.design.pattern.proxy.orcamento.Orcamento;

import java.math.BigDecimal;

public class ISS extends Imposto {

	public ISS(Imposto outro) {
		super(outro);
	}

	public BigDecimal realizarCalculo(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.06"));
	}

}
