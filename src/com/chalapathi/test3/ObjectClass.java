package com.chalapathi.test3;

import java.util.Objects;

class Example {
    int id;
    String name;

    Example(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Example{id=" + id + ", name='" + name + "'}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Example example = (Example) obj;
        return id == example.id && name.equals(example.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}


public class ObjectClass {
    public static void main(String[] args) {
        System.out.println(new ObjectClass().getClass().getName());
        System.out.println(ObjectClass.class.getName());
        //System.out.println(ObjectClass.class.getModule());
        System.out.println(new ObjectClass().hashCode());

        Example example = new Example(1, "ChatGPT");
        System.out.println  (example.toString());  // Output: Example{id=1, name='ChatGPT'}
        System.out.println(example);

        System.out.println(new ObjectClass());


        Example ex1 = new Example(1, "ChatGPT");
        Example ex2 = new Example(1, "ChatGPT");
        System.out.println(ex1.equals(ex2));  // Output: true

    }
}
