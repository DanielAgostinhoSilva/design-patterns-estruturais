package br.com.design.pattern.composite.imposto;

import br.com.design.pattern.composite.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeImpostos {

	public BigDecimal calcular(Orcamento orcamento, Imposto imposto) {
		return imposto.calcular(orcamento);
	}

}
