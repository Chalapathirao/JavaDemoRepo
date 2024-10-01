package com.chalapathi.test3;

//record Person8(String name, int age) {
//}

record Person8(String name, int age){
    public static String UNKNOWN_ADDRESS = "Unknown";
    public static Person8 unnamed(String address) {
        return new Person8("Unnamed", 67);
    }
}

public class RecordClassTest {
    public static void main(String[] args) {
       Person8 p = new Person8("Ram",22);
        System.out.println(p.name()+" : "+p.age());
        System.out.println(Person8.UNKNOWN_ADDRESS);
        System.out.println(Person8.unnamed("Hello"));
    }
}
