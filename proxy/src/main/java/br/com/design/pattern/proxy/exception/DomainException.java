package br.com.design.pattern.proxy.exception;

public class DomainException extends RuntimeException {
    public DomainException(String message) {
        super(message);
    }
}
