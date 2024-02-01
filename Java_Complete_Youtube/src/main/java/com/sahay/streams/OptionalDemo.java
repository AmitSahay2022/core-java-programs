package com.sahay.streams;

import java.util.Optional;

/*
WAP which receives a String and return optional<String>
 */
public class OptionalDemo {
    public static Optional<String > get(String data){
        if(data==null) return Optional.empty();
        if(data.isEmpty()) return Optional.empty();
        return Optional.of(data.toUpperCase());
    }

    public static void main(String[] args) {
        System.out.println(get(""));
        System.out.println(get("Brock"));
    }
}
