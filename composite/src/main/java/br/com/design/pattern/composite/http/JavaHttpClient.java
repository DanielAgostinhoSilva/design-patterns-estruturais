package br.com.design.pattern.composite.http;

import lombok.extern.log4j.Log4j2;

import java.util.Map;

@Log4j2
public class JavaHttpClient implements HttpAdapter{

    @Override
    public void post(String url, Map<String, Object> dados) {

        log.info("Simulando uma chamada post!");

    }
}
