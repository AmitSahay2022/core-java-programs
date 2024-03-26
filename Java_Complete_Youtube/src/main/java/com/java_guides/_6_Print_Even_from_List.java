package com.java_guides;

import java.util.List;

public class _6_Print_Even_from_List {
    public static void main(String[] args) {
        List<Integer> nums=List.of(2,3,4,5,6,1,3,8,9);
        nums.stream().filter(n->n%2==0).forEach(n-> System.out.print(n+" "));
    }
}
