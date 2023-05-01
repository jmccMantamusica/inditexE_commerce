package com.inditex.ecommerce.domain.service;
/**
 *
 * @author jcagigas
 */
public class DomainException extends RuntimeException{
    DomainException(final String message) {
        super(message);
    }
}
