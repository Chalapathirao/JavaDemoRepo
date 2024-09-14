package com.chalapathi.test7;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FactoryMethodsExample {
    public static void main(String[] args) {
        List<String> list = List.of("Java","JavaFX","Spring","Hibernate","JSP");
        Set<String> set = Set.of("Java","JavaFX","Spring","Hibernate","JSP");
        Map<Integer,String> map = Map.of(101,"JavaFX",102,"Hibernate",103,"Spring MVC");
        System.out.println(list);
        System.out.println(set);
        System.out.println(map);
        System.out.println(Arrays.asList("Java","JavaFX","Spring","Hibernate","JSP"));
    }
}
