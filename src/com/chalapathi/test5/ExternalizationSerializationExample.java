package com.chalapathi.test5;

import java.io.*;

public class ExternalizationSerializationExample {
    public static void main(String[] args) {
        Person person = new Person("John Doe", 30, "mySecretPassword");
        String filename = "person.ext";

        // Serialization
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) {
            out.writeObject(person);
            System.out.println("Serialization Successful: " + person);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
class Person implements Externalizable {
    private String name;
    private int age;
    private transient String password; // transient field will not be serialized

    // Mandatory public no-arg constructor
    public Person() {
        System.out.println("No-arg constructor called");
    }

    public Person(String name, int age, String password) {
        this.name = name;
        this.age = age;
        this.password = password;
    }


    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        // Serialize fields explicitly
        out.writeObject(name);
        out.writeInt(age);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        // Deserialize fields explicitly
        name = (String) in.readObject();
        age = in.readInt();
    }
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + ", password='" + password + "'}";
    }
}
