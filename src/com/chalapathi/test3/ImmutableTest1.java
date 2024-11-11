package com.chalapathi.test3;


final class ImmutablePerson {
    private final String name;
    private final int age;

    // Constructor to initialize fields
    public ImmutablePerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // No setters provided, only getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "ImmutablePerson{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
// No methods that modify fields are present
}

public class ImmutableTest1 {
    public static void main(String[] args) {
        ImmutablePerson p1 = new ImmutablePerson("vicky", 4);
        System.out.println(p1);

        //can not modify
    }
}
