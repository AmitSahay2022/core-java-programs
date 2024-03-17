package org.example.functional_programming;

import java.util.List;

public class FilterAndReduceExample {
    public static void main(String[] args) {
        List<String> words=List.of("Prasant","Jain ","is Teaching","Java Programming","very","bad");
        //any word which has length greater than 5 should be added
        String reduce = words.stream().filter(w -> w.length() > 5).reduce("", (s1, s2) -> {
            StringBuilder builder = new StringBuilder();
            builder.append(s1 + " ");
            builder.append(s2);
            return builder.toString();
        });
        System.out.println(reduce);

    }
}
