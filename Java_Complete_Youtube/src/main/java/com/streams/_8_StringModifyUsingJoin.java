package com.streams;

import java.util.Arrays;
import java.util.List;

public class _8_StringModifyUsingJoin {
    public static void main(String[] args) {
        //String[] nums={"1","2","3","4"};
        List<String>  nums=Arrays.asList("1","2","3","4");
        String join = String.join("-", nums);
        System.out.println(join);
    }
}
