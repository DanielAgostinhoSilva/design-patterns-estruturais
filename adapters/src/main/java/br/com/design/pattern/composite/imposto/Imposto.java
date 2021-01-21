package br.com.design.pattern.observer.imposto;

import br.com.design.pattern.observer.orcamento.Orcamento;

import java.math.BigDecimal;

public interface Imposto {

	BigDecimal calcular(Orcamento orcamento);

}
