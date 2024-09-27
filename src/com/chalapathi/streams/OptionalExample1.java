package com.chalapathi.streams;

import java.util.NoSuchElementException;
import java.util.Optional;

public class OptionalExample1 {
    public static void main(String[] args) {
        // Traditional null handling
        String name = getName();
        if (name != null) {
            System.out.println(name.length());
        } else {
            System.out.println("Name is null");
        }

        // Using Optional
        Optional<String> optionalName = getOptionalName();
        optionalName.ifPresent(n -> System.out.println(n.length()));
        System.out.println(optionalName.orElse("Hello"));
        //optionalName.orElseThrow(() -> new NoSuchElementException("Value not present"));

        Optional<String> opt = Optional.of("Hello");
        Optional<String> result = opt.or(() -> Optional.of("Default"));
        System.out.println(result.get()); // Output: Hello

        Optional<String> emptyOpt = Optional.empty();
        Optional<String> result2 = emptyOpt.or(() -> Optional.of("Default"));
        System.out.println(result2.get()); // Output: Default

        Optional<String> emptyOptional = Optional.ofNullable(null);
        Optional<String> result3 = emptyOptional.or(() -> Optional.of("Default"));
        System.out.println(result3.get()); // Output: Default

        //providing default value
        // Without Optional
        String name1 = getName();
        System.out.println(name1 != null ? name1 : "Default Name");

        // With Optional
        Optional<String> optionalName1 = getOptionalName();
        System.out.println(optionalName1.orElse("Default Name"));
        System.out.println(1 + "2" + 3);


    }

    public static String getName() {
        return null; // simulate no value
    }

    public static Optional<String> getOptionalName() {
        return Optional.ofNullable(null); // simulate no value
    }
}
