package com.chalapathi.streams;

import java.util.List;
import java.util.stream.IntStream;

public class ParallelStreamExample {
    public static void main(String[] args) {

//        long start = System.currentTimeMillis();
//        IntStream.range(1, 100).forEach(System.out::println);
//        System.out.println();
//        //IntStream.rangeClosed(1,5).forEach(System.out::println);
//        //IntStream.iterate(1, n->n+1).limit(5).forEach(System.out::println);
//        long end = System.currentTimeMillis();
//        System.out.println("Plain stream took time : " + (end - start));
//        System.out.println("============================================");
//
//        start=System.currentTimeMillis();
//        IntStream.range(1,100).parallel().forEach(System.out::println);
//        end=System.currentTimeMillis();
//        System.out.println("Parallel stream took time : "+(end-start));

        /*IntStream.range(1,10).forEach(x->{
            System.out.println("Thread : "+Thread.currentThread().getName()+" : "+x);
        });
        System.out.println();
        IntStream.range(1,10).parallel().forEach(x->{
            System.out.println("Thread : "+Thread.currentThread().getName()+" : "+x);
        });*/

        List<Employee5> employees = DataBase.getEmployees();
        double salaryWithStream = employees.stream()
                .map(Employee5::getSalary).mapToDouble(i -> i).average().getAsDouble();
        System.out.println(salaryWithStream);
        System.out.println(employees.parallelStream().mapToDouble(Employee5::getSalary).average().getAsDouble());
    }
}
