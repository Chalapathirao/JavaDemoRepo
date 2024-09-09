package com.chalapathi.test3;

import java.io.*;

class Person2 implements Serializable{
    int id;
    String name;
    Person2(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
class Student2 extends Person2{
    String course;
    int fee;
    public Student2(int id, String name, String course, int fee) {
        super(id,name);
        this.course=course;
        this.fee=fee;
    }
}
public class SerilizeAndDeserilizeWithInheritence
{
    public static void main(String[] args)
    {
        try{
            //Creating the object
            Student2 s1 =new Student2(211,"ravi","Engineering",50000);
            //Creating stream and writing the object
            FileOutputStream fout=new FileOutputStream("f2.txt");
            ObjectOutputStream out=new ObjectOutputStream(fout);
            out.writeObject(s1);
            out.flush();
            //closing the stream
            out.close();
            System.out.println("success");
        }catch(Exception e){System.out.println(e);}
        try{
            //Creating stream to read the object
            ObjectInputStream in=new ObjectInputStream(new FileInputStream("f2.txt"));
            Student2 s=(Student2)in.readObject();
            //printing the data of the serialized object
            System.out.println(s.id+" "+s.name+" "+s.course+" "+s.fee);
            //closing the stream
            in.close();
        }catch(Exception e){System.out.println(e);}
    }
}