package org.example._99_terminalOperator;

import java.util.Arrays;
import java.util.List;

public class _3_PrintOnlyOddFromAList {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9);
        list.stream().filter(n->n%2==1).forEach(n-> System.out.print(n+" "));
    }
}
