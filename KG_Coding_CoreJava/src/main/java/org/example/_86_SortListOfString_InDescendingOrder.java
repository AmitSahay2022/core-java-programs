package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class _86_SortListOfString_InDescendingOrder {

    public static void main(String[] args) {
        List<String> names= Arrays.asList("Ram","Shyam","Anjali","Rimi","Krishna","Amit");
        System.out.println("List Before Sorting...");
        names.forEach(n-> System.out.print(n+" "));
        System.out.println("\nList After Sorting in Reverse Order...");
        names.stream().sorted(Comparator.reverseOrder()).forEach(n-> System.out.print(n+" "));
    }
}
