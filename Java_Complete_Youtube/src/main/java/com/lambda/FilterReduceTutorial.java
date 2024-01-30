package com.lambda;

import java.util.Arrays;

public class FilterReduceTutorial {
    public static void main(String[] args) {
        String [] words={"This is Amit"," Java Developer"," python","react"," 5 year of exp"};
        //Get those String which has length more than 10 and then concatinate it
        String myWord = Arrays.stream(words)
                              .filter(w -> w.length() >= 10)
                              .reduce("", (w1, w2) -> w1 + " " + w2);
        System.out.println(myWord);
    }
}
