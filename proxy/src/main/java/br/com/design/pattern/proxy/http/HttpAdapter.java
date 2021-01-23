package br.com.design.pattern.proxy.http;

import java.util.Map;

public interface HttpAdapter {
    void post(String url, Map<String, Object> dados);
}
