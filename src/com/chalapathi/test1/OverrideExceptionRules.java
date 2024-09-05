package com.chalapathi.test1;

import java.io.FileNotFoundException;
import java.io.IOException;

class Parent {
    void display() throws IOException {
        // Some code
        System.out.println("in parent display()");
    }
}

class Child extends Parent {
    @Override
    void display() throws FileNotFoundException, RuntimeException {  // Allowed: Subclass of IOException and unchecked exceptions
        // Some code
        System.out.println("in child display()");
    }
}
public class OverrideExceptionRules {
    public static void main(String[] args) throws IOException {
        Parent p = new Child();
        p.display();
    }

}

