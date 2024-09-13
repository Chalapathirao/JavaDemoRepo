package com.chalapathi.test6;

import java.util.*;
public class MapExample2{
    public static void main(String[] args){
        Map<Integer,String> map= new HashMap<>();
        map.put(100,"Amit");
        map.put(101,"Vijay");
        map.put(102,"Rahul");
        map.put(103,"Raja");
        //Elements can traverse in any order
        for(Map.Entry m:map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
        System.out.println();
        //
        for (Integer key : map.keySet()) {
            String value = map.get(key);
            System.out.println(key + ": " + value);
        }
        //
        System.out.println();
        map.forEach((k, v) -> System.out.println(k + " "+v));
    }


}
