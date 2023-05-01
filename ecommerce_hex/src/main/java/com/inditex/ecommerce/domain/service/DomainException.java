package com.inditex.ecommerce.domain.service;

public class DomainException extends RuntimeException{
    DomainException(final String message) {
        super(message);
    }
}
