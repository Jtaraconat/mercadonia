package com.johantaraconat.mercadoniabackend.exception;

public class ProductNotFoundException extends RuntimeException{
    public ProductNotFoundException(long id){
        super("Could not found the product with the specific id" + id);
    }
}
