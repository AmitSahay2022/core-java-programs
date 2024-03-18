package org.example._98_functional_programming;

import java.util.Optional;

public class OptionalTutorial {
    public static void main(String[] args) {
        Optional<String> word = word("  ");
        Optional<String> apple = word("Apple");
        Optional<String> word1 = word(null);
        System.out.println(word);
        System.out.println(word1);
        System.out.println(apple);
    }
    //Method which take a string, return a Optional with uppercase
    public static Optional<String> word(String line){
        if(line==null || line.isBlank()){
            return Optional.empty();
        }
        return Optional.of(line.toUpperCase());
    }
}
