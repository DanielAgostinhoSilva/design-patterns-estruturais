package br.com.design.pattern.proxy.imposto;

import br.com.design.pattern.proxy.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeImpostos {

	public BigDecimal calcular(Orcamento orcamento, Imposto imposto) {
		return imposto.calcular(orcamento);
	}

}
