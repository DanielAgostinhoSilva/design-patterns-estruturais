package br.com.design.pattern.observer.imposto;

import br.com.design.pattern.observer.orcamento.Orcamento;

import java.math.BigDecimal;

public class ICMS implements Imposto {

	public BigDecimal calcular(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.1"));
	}

}
