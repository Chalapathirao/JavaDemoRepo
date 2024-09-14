package com.chalapathi.test7;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Product {
    int id;
    String name;
    float price;

    public Product(int id, String name, float price) {
        super();
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

public class LambdaExpressionExample11 {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<Product>();
        list.add(new Product(1, "Samsung A5", 170f));
        list.add(new Product(3, "Iphone 6S", 170f));
        list.add(new Product(2, "Sony Xperia", 250f));
        list.add(new Product(4, "Nokia Lumia", 250f));
        list.add(new Product(5, "Redmi4 ", 260f));
        list.add(new Product(6, "Lenevo Vibe", 260f));

        List<Product> list1 = list.stream().filter(p -> p.price < 180).toList();
        System.out.println(list1.size());
        System.out.println(list1);
        list1.forEach(p-> System.out.println( "id=" + p.id +
                ", name='" + p.name + '\'' +
                ", price=" + p.price));

        list.stream().map(p -> p.price).distinct().forEach(System.out::println);
        Map<Float, List<Product>> productsByPrice = list.stream().collect(Collectors.groupingBy(p -> p.price));
        System.out.println("");
        productsByPrice.forEach((price, productList) ->{
            System.out.println("Price: " + price);
            productList.forEach(System.out::println);
        });

        // 3. Reduce to Calculate Total Price of All Products
        float totalPrice = list.stream()
                .map(p -> p.price)
                .reduce(0.0f, Float::sum);
        System.out.println("Total Price of All Products: " + totalPrice);

        // 4. Find Any Product Over a Certain Price
        Optional<Product> expensiveProduct = list.stream()
                .filter(p -> p.price > 255.00f)
                .findAny();
        expensiveProduct.ifPresent(p -> System.out.println("Found Expensive Product: " + p));


    }
}
