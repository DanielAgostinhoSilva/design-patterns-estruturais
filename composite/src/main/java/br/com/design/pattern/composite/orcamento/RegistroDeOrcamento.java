package br.com.design.pattern.composite.orcamento;

import br.com.design.pattern.composite.exception.DomainException;
import br.com.design.pattern.composite.http.HttpAdapter;

import java.util.Map;

public class RegistroDeOrcamento {

    private HttpAdapter http;

    public RegistroDeOrcamento(HttpAdapter http) {
        this.http = http;
    }

    public void registrar(Orcamento orcamento) {
        if ( !orcamento.isFinalizado() ) {
            throw new DomainException("Orcamento nao finalizado!");
        }

        String url = "http://api.externa/orcamento";
        Map<String, Object> dados = Map.of(
                "valor", orcamento.getValor(),
                "quantiadeDeItens", orcamento.getQuantidadeDeItens()
        );
        http.post(url, dados);
    }
}
