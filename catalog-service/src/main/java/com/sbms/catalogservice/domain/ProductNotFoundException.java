package com.sbms.catalogservice.domain;

public class ProductNotFoundException extends RuntimeException {
    public ProductNotFoundException(String message) {
        super(message);
    }

    public static ProductNotFoundException forCode(String message) {
        return new ProductNotFoundException(message);
    }
}
