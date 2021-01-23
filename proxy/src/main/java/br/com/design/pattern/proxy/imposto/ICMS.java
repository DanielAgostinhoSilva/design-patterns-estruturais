package br.com.design.pattern.proxy.imposto;

import br.com.design.pattern.proxy.orcamento.Orcamento;

import java.math.BigDecimal;

public class ICMS extends Imposto {

	public ICMS(Imposto outro) {
		super(outro);
	}

	public BigDecimal realizarCalculo(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.1"));
	}

}
