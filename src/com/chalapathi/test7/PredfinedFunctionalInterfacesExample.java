package com.chalapathi.test7;

import java.util.function.*;

public class PredfinedFunctionalInterfacesExample {
    public static void main(String[] args) {
       // Function<String, Integer> lengthFunction = str -> str.length();
        Function<String, Integer> lengthFunction = String::length;
        int length = lengthFunction.apply("Hello, World!");
        System.out.println("String length: " + length); // Output: 13

//        BiFunction<Integer, Integer, Integer> addFunction =  (a, b) -> a + b;
        BiFunction<Integer, Integer, Integer> addFunction = Integer::sum;
        int result = addFunction.apply(5, 3);
        System.out.println("Sum: " + result);

        Consumer<String> printConsumer = str -> System.out.println("Hello, " + str);
        printConsumer.accept("Alice");

        BiConsumer<String, Integer> printBiConsumer = (name, age) -> System.out.println(name + " is " + age + " years old");
        printBiConsumer.accept("Bob", 30);


//        Supplier<Double> randomSupplier = () -> Math.random();
        Supplier<Double> randomSupplier = Math::random;
        System.out.println("Random Number: " + randomSupplier.get());

   //there is no BiSupplier

        Predicate<Integer> isEven = num -> num % 2 == 0;
        System.out.println("Is this even? " + isEven.test(4));
        System.out.println("Is this even? " + isEven.test(5));


        BiPredicate<Integer, Integer> isCustomEven =(num1, num2) -> num1+num2 % 2 == 0;
        System.out.println("Is this custom even? " + isCustomEven.test(5, 7));

        UnaryOperator<Integer> squareFunction = n -> n * n;
        System.out.println("Square of 5: " + squareFunction.apply(5));

        BinaryOperator<Integer> multiply = (a, b) -> a * b;
        System.out.println("Multiplication: " + multiply.apply(4, 3));

        IntFunction<String> intToString = value -> "Number: " + value;
        System.out.println(intToString.apply(10));

        ToIntFunction<String> stringLength = str -> str.length();
        System.out.println("Length of 'hello': " + stringLength.applyAsInt("hello"));

        BooleanSupplier isPositive = () -> 5 > 0;
        System.out.println("Is number positive? " + isPositive.getAsBoolean());

        IntPredicate isEven1 = value -> value % 2 == 0;
        System.out.println("Is 4 even? " + isEven1.test(4));
    }
}
