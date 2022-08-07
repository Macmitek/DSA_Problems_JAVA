package com.HashMap;

import java.util.*;

public class TempPrac {
    public static void main(String[] args) {
        HashMap<String,Integer>  map = new HashMap<>();
        //Insertion
        map.put("India",120);
        map.put ("USA",200);
        map.put("China",300);
        map.put("Indonesia",240);
        for(Map.Entry<String,Integer> e : map.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
        }
        System.out.println("After Removing");
        map.remove("USA");
        for(Map.Entry<String,Integer> e : map.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
        }
        Set<String> keys = map.keySet();
        for(String key : keys){
            System.out.println(key+" "+map.get(key));
        }


        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(4);
        set.add(9);
        set.add(0);
        set.add(9);
        System.out.println("Size: "+set.size());
        System.out.println(" "+set);

        Iterator it = set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
