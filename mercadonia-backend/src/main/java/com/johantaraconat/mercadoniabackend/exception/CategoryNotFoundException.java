package com.johantaraconat.mercadoniabackend.exception;

public class CategoryNotFoundException extends RuntimeException{
    public CategoryNotFoundException(long id){
        super("Could not found the category with the specific id" + id);
    }
}
