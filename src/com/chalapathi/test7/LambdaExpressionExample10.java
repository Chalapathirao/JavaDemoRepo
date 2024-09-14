package com.chalapathi.test7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
class Product1{
    int id;
    String name;
    float price;
    public Product1(int id, String name, float price) {
        super();
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
public class LambdaExpressionExample10{
    public static void main(String[] args) {
        List<Product1> list=new ArrayList<Product1>();

        //Adding Products
        list.add(new Product1(1,"HP Laptop",25000f));
        list.add(new Product1(3,"Keyboard",30f));
        list.add(new Product1(2,"Dell Mouse",150f));

        System.out.println("Sorting on the basis of name...");

        // implementing lambda expression
        Collections.sort(list, Comparator.comparing(p -> p.name));
        for(Product1 p:list){
            System.out.println(p.id+" "+p.name+" "+p.price);
        }

    }
}
