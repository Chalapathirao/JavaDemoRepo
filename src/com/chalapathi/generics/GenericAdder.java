package com.chalapathi.generics;

public class GenericAdder<T> {
    private T firstElement;
    private T secondElement;

    // Constructor
    public GenericAdder(T firstElement, T secondElement) {
        this.firstElement = firstElement;
        this.secondElement = secondElement;
    }

    // Method to add the two elements
    public Object addElements() {
        if (firstElement instanceof String && secondElement instanceof String) {
            // Concatenate if both are strings
            return (String) firstElement + (String) secondElement;
        } else if (firstElement instanceof Number && secondElement instanceof Number) {
            // Add if both are numbers
            double sum = ((Number) firstElement).doubleValue() + ((Number) secondElement).doubleValue();
            // Return an Integer if both inputs are Integer types, otherwise return Double
            if (firstElement instanceof Integer && secondElement instanceof Integer) {
                return (int) sum;
            } else {
                return sum;
            }
        } else {
            throw new IllegalArgumentException("Unsupported types: Both elements should be either String or Number types.");
        }
    }
}


class GenericAdderTest {
    public static void main(String[] args) {
//        GenericAdder<String> stringAdder = new GenericAdder<>("Hello", "World");
//        System.out.println(stringAdder.addElements()); // Output: HelloWorld
//
//        GenericAdder<Integer> intAdder = new GenericAdder<>(10, 20);
//        System.out.println(intAdder.addElements()); // Output: 30
//
//        GenericAdder<Double> doubleAdder = new GenericAdder<>(2.5, 3.7);
//        System.out.println(doubleAdder.addElements()); // Output: 6.2

        // Example with Integer addition
            GenericAdder<Integer> intAdder = new GenericAdder<>(5, 10);
            System.out.println("Integer Addition: " + intAdder.addElements());  // Output: 15

            // Example with Double addition
            GenericAdder<Double> doubleAdder = new GenericAdder<>(5.5, 10.3);
            System.out.println("Double Addition: " + doubleAdder.addElements());  // Output: 15.8

            // Example with String concatenation
            GenericAdder<String> stringAdder = new GenericAdder<>("Hello", " World");
            System.out.println("String Concatenation: " + stringAdder.addElements());  // Output: Hello World

            // Example with mixed types (should throw an exception)
            try {
                GenericAdder<Object> mixedAdder = new GenericAdder<>("Hello", 5);
                System.out.println(mixedAdder.addElements());
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());  // Output: Unsupported types: Both elements should be either String or Number types.
            }
    }
}
