package com.chalapathi.test7;

import java.util.*;
import java.util.stream.*;



public class StreamExamples {

    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product(1, "Laptop", 1000.00f),
                new Product(2, "Phone", 500.00f),
                new Product(3, "Tablet", 600.00f),
                new Product(4, "Monitor", 150.00f),
                new Product(5, "Keyboard", 50.00f)
        );

        // 1. Filter Products by Price
        List<Product> filteredProducts = products.stream()
                .filter(p -> p.price > 500.00f)
                .toList();
        System.out.println("Filtered Products (Price > 500): " + filteredProducts);

        // 2. Map Product Names to a List
        List<String> productNames = products.stream()
                .map(p -> p.name)
                .collect(Collectors.toList());
        System.out.println("Product Names: " + productNames);

        // 3. Reduce to Calculate Total Price of All Products
        float totalPrice = products.stream()
                .map(p -> p.price)
                .reduce(0.0f, Float::sum);
        System.out.println("Total Price of All Products: " + totalPrice);

        // 4. Find Any Product Over a Certain Price
        Optional<Product> expensiveProduct = products.stream()
                .filter(p -> p.price > 900.00f)
                .findAny();
        expensiveProduct.ifPresent(p -> System.out.println("Found Expensive Product: " + p));

        // 5. Check if All Products are Below a Certain Price
        boolean allCheap = products.stream()
                .allMatch(p -> p.price < 2000.00f);
        System.out.println("Are All Products Below 2000? " + allCheap);

        // 6. Find the Maximum Priced Product
        Optional<Product> maxPricedProduct = products.stream()
                .max(Comparator.comparing(p -> p.price));
        maxPricedProduct.ifPresent(p -> System.out.println("Most Expensive Product: " + p));

        // 7. Collect to a Map of ID to Name
        Map<Integer, String> productMap = products.stream()
                .collect(Collectors.toMap(p -> p.id, p -> p.name));
        System.out.println("Product Map (ID to Name): " + productMap);

        // 8. Group Products by Price Range
        Map<String, List<Product>> productsByPriceRange = products.stream()
                .collect(Collectors.groupingBy(p -> {
                    if (p.price < 200) return "Cheap";
                    else if (p.price <= 700) return "Moderate";
                    else return "Expensive";
                }));
        System.out.println("Products Grouped by Price Range: " + productsByPriceRange);

        // 9. Sort Products by Price
        List<Product> sortedByPrice = products.stream()
                .sorted(Comparator.comparing(p -> p.price))
                .collect(Collectors.toList());
        System.out.println("Products Sorted by Price: " + sortedByPrice);

        // 10. Count Number of Products with Price Greater Than 300
        long count = products.stream()
                .filter(p -> p.price > 300.00f)
                .count();
        System.out.println("Number of Products with Price > 300: " + count);

        // 11. Collect Product Prices into a Set (to avoid duplicates)
        Set<Float> uniquePrices = products.stream()
                .map(p -> p.price)
                .collect(Collectors.toSet());
        System.out.println("Unique Prices: " + uniquePrices);

        // 12. Create a String of Product Names Separated by Comma
        String productNamesStr = products.stream()
                .map(p -> p.name)
                .collect(Collectors.joining(", "));
        System.out.println("Product Names as String: " + productNamesStr);

        // 13. Partition Products into Expensive and Non-Expensive Categories
        Map<Boolean, List<Product>> partitionedProducts = products.stream()
                .collect(Collectors.partitioningBy(p -> p.price > 500));
        System.out.println("Partitioned Products (Expensive and Non-Expensive): " + partitionedProducts);

        // 14. Peek at Products While Iterating
        List<Product> peekedProducts = products.stream()
                .peek(p -> System.out.println("Processing Product: " + p.name))
                .collect(Collectors.toList());

        // 15. Convert Stream to Array
        Product[] productArray = products.stream().toArray(Product[]::new);
        System.out.println("Products as Array: " + Arrays.toString(productArray));

       // Double sumPrices = products.stream().collect(Collectors.summingDouble(x->x.price));  // collecting as list
        Double sumPrices = products.stream().mapToDouble(x -> x.price).sum();
        System.out.println("Sum of prices: "+sumPrices);

        Double average = products.stream()
                .collect(Collectors.averagingDouble(p->p.price));
        System.out.println("Average price is: "+average);

//        Long noOfElements = products.stream()
//                .collect(Collectors.counting());
//        Long noOfElements = products.stream().count();

        long noOfElements = (long) products.size();
        System.out.println("Total elements : "+noOfElements);
    }
}

