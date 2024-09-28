package com.chalapathi.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Optional;

class Customer {

    private int id;
    private String name;
    private String email;
    private List<String> phoneNumbers;

    public Customer() {
    }

    public Customer(int id, String name, String email, List<String> phoneNumbers) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumbers = phoneNumbers;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Optional<String> getEmail() {
        return Optional.ofNullable(email);
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }
}

class EkartDataBase {
    public static List<Customer> getAll() {
        return Stream.of(
                new Customer(101, "john", "john@gmail.com", Arrays.asList("397937955", "21654725")),
                new Customer(102, "smith", "smith@gmail.com", Arrays.asList("89563865", "2487238947")),
                new Customer(103, "peter", "peter@gmail.com", Arrays.asList("38946328654", "3286487236")),
                new Customer(104, "kely", "kely@gmail.com", Arrays.asList("389246829364", "948609467"))
        ).collect(Collectors.toList());
    }
}


public class OptionalDemo {
    public static Customer getCustomerByEmailId(String email) throws Exception {
        List<Customer> customers = EkartDataBase.getAll();
        return customers.stream().filter(customer -> customer.getEmail().equals(Optional.ofNullable(email))).findAny().orElseThrow(() -> new Exception("no customer present with this email id"));
    }

    public static void main(String[] args) throws Exception {
        //getCustomerByEmailId("pqr");
        Customer customer = getCustomerByEmailId("smith@gmail.com");
        System.out.println(customer.getName());


        //empty
        //of
        //ofNullable

        Optional<Object> emptyOptional = Optional.empty();
        System.out.println(emptyOptional);

        //Optional<String> emailOptional = Optional.of(customer.getEmail());
        //System.out.println(emailOptional);

        Optional<String> emailOptional2 = Optional.of(customer.getEmail().get());
       /* if(emailOptional2.isPresent()){
            System.out.println(emailOptional2.get());
        }*/
        // System.out.println(emailOptional2.orElse("default@email.com"));

        // System.out.println(emailOptional2.orElseThrow(()->new IllegalArgumentException("email not present")));
        System.out.println(emailOptional2.map(String::toUpperCase).orElseGet(()->"default email..."));


    }


}
