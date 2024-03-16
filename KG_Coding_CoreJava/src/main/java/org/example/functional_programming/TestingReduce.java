package org.example.functional_programming;

import java.util.List;
import java.util.Optional;

public class TestingReduce {
    public static void main(String[] args) {
        List<Integer> numbers=List.of(3,5,7,9,2,5,8,12);
        Integer total = numbers.stream().reduce(0, (a, b) -> a + b);
        System.out.println(total);
        //Find min using reduce
        Optional<Integer> min = numbers.stream().reduce((a, b) -> a < b ? a : b);
        if(min.isPresent()){
            System.out.println("Minimum is: "+min.get());
        }
        //Find max using reduce
        Optional<Integer> max = numbers.stream().reduce((a, b) -> a > b ? a : b);
        if(min.isPresent()){
            System.out.println("Maximum is= "+max.get());
        }
    }
}
