package com.chalapathi.streams;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        Optional<String> optional = Optional.of("Hello World!");

        // Check if value is present
        if (optional.isPresent()) {
            System.out.println("Value is present: " + optional.get());
        } else {
            System.out.println("Value is absent");
        }

        // Using ifPresent
        optional.ifPresent(value -> System.out.println("Value using ifPresent: " + value));

        // Using orElse
        String defaultValue = optional.orElse("Default Value");
        System.out.println("Value using orElse: " + defaultValue);

        // Using orElseGet
        String defaultValue2 = optional.orElseGet(() -> "Default Value from Supplier");
        System.out.println("Value using orElseGet: " + defaultValue2);

        // Using orElseThrow
        try {
            String value = optional.orElseThrow(() -> new IllegalArgumentException("Value not present"));
            System.out.println("Value using orElseThrow: " + value);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
