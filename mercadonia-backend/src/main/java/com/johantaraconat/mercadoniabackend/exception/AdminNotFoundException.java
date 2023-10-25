package com.johantaraconat.mercadoniabackend.exception;

public class AdminNotFoundException extends RuntimeException {
    public AdminNotFoundException(long id){
        super("Could not found the admin with the specific id" + id);
    }
}
