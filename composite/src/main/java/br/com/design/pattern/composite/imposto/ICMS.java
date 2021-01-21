package br.com.design.pattern.composite.imposto;

import br.com.design.pattern.composite.orcamento.Orcamento;

import java.math.BigDecimal;

public class ICMS extends Imposto {

	public ICMS(Imposto outro) {
		super(outro);
	}

	public BigDecimal realizarCalculo(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.1"));
	}

}