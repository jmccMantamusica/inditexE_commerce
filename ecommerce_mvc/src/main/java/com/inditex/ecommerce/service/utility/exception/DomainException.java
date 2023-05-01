package com.inditex.ecommerce.service.utility.exception;

public class DomainException extends RuntimeException{
    DomainException(final String message) {
        super(message);
    }
}
