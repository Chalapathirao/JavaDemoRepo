package com.chalapathi.Test8;

import java.io.*;
import java.lang.reflect.Constructor;

class Singleton implements Serializable, Cloneable {
    private static Singleton instance;
    @Serial
    private static final long serialVersionUID = 1L;
    private Singleton() {
        // Prevent instantiation from reflection
//        if (instance != null) {
//            throw new IllegalStateException("Singleton instance already created.");
//        }
    }

    public static Singleton getInstance() {
        if(instance == null){
            return new Singleton();
        }
        return null;
    }

    protected Object readResolve() {
        return instance;
    }

//    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // Creates a new instance
    }
}

public class ReflectionBreak {
    public static void main(String[] args) throws Exception {
        Singleton instance1 = Singleton.getInstance();

        // Using reflection to create another instance
//        Constructor<Singleton> constructor = Singleton.class.getDeclaredConstructor();
//        constructor.setAccessible(true); // Bypass the private constructor
//        Singleton instance2 = constructor.newInstance();

//        System.out.println(instance1.hashCode()); // Original instance hash
//        System.out.println(instance2.hashCode()); // Reflection-created instance hash


        // Serialize the Singleton instance
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("singleton.ser"));
        out.writeObject(instance1);
        out.close();

        // Deserialize the Singleton instance
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("singleton.ser"));
        Singleton instance3 = (Singleton) in.readObject();
        in.close();

        System.out.println(instance1.hashCode()); // Original instance hash
        System.out.println(instance3.hashCode()); // Deserialized instance hash

        // Clone the Singleton instance
//        Singleton instance4= (Singleton) instance1.clone();
//
//        System.out.println(instance1.hashCode()); // Original instance hash
//        System.out.println(instance4.hashCode()); // Cloned instance hash

    }
}

