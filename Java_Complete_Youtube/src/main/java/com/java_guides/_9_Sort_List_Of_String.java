package com.java_guides;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class _9_Sort_List_Of_String {
    public static void main(String[] args) {
        List<String> names= Arrays.asList("Ram","Shyam","Raju","Babu Bhaiya","Beech","me","mat","Aayeye");
        names.stream().sorted(Comparator.reverseOrder()).forEach(n-> System.out.print(n+" "));
    }
}
