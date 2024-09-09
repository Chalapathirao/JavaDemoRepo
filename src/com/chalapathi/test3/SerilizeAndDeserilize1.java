package com.chalapathi.test3;

import java.io.Serializable;
import java.io.*;

class Student1 implements Serializable {
    int id;
    String name;

    public Student1(int id, String name) {
        this.id = id;
        this.name = name;
    }
}


public class SerilizeAndDeserilize1 {
    public static void main(String[] args) {
        //persist();
        depersist();
    }

     static void persist() {
        try {
            //Creating the object
            Student1 s1 = new Student1(211, "ravi");
            //Creating stream and writing the object
            FileOutputStream fout = new FileOutputStream("f.txt");
            ObjectOutputStream out = new ObjectOutputStream(fout);
            out.writeObject(s1);
            out.flush();
            //closing the stream
            out.close();
            System.out.println("success");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

     static void depersist(){
        try{
            //Creating stream to read the object
            ObjectInputStream in=new ObjectInputStream(new FileInputStream("f.txt"));
            Student1 s=(Student1)in.readObject();
            //printing the data of the serialized object
            System.out.println(s.id+" "+s.name);
            //closing the stream
            in.close();
        }catch(Exception e){System.out.println(e);}
    }
}