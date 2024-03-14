package org.example;

import java.util.HashMap;
import java.util.Map;

public class _93_MapMethods {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("Apple",120);
        map.put("Mango",60);
        map.put("Orange",40);
        map.put("Banana",30);
        map.put("Coconut",20);
        System.out.println("Orange value is: "+map.get("Orange"));
        map.remove("Banana");
        System.out.println("Is Mango in this map? "+map.containsKey("Mango"));
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.entrySet());
    }
}
