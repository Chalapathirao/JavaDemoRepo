package com.chalapathi.Test8;

import java.io.*;

/**
 * Let's say your singleton has implemented serialization. Now what will happen if you serialize object and deserialize.
 * During deserialization it will create the new object every time if we go in traditional way.
 * To resolve it add readResolve method which will ensure that during deserialize we return same instance.
 *
 * Check Main class for violation example
 */
public class SerializableSingleton implements Serializable {
    private static  SerializableSingleton instance = null;
    private SerializableSingleton() {

    }

    public static SerializableSingleton getInstance() {
        if(instance == null) {
            instance = new SerializableSingleton();
        }
        return instance;
    }

    /**
     * This is the key method which is responsible during deserialization process
     * This method get invoked, and we are simply returning already created object
     * @return
     */
    protected Object readResolve() {
        return instance;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {


        SerializableSingleton serializableSingleton = SerializableSingleton.getInstance();
        ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(new FileOutputStream("object1.obj"));
        objectOutputStream2.writeObject(serializableSingleton);
        objectOutputStream2.close();
        ObjectInputStream objectInputStream2 = new ObjectInputStream(new FileInputStream("object1.obj"));
        SerializableSingleton deserializedInstance = (SerializableSingleton) objectInputStream2.readObject();
        objectInputStream2.close();
        System.out.println("SerializableSingleton Object 1 :" + serializableSingleton.hashCode());
        System.out.println(" SerializableSingleton Object 2 :" + deserializedInstance.hashCode());

    }
}
