package com.johantaraconat.mercadoniabackend.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;

public class TokenUtils {
    public static final Random r = new Random();
    public static final String alphabet = "0123456789abcdefghijkllmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    MessageDigest md = MessageDigest.getInstance("SHA-256");


    public TokenUtils() throws NoSuchAlgorithmException {
    }


    public static String getSalt (int size) {
        String s = "";
        for(int i = 0; i < size; i ++) {
            s += alphabet.charAt(r.nextInt(alphabet.length()));
        }
        return s;
    }

}
