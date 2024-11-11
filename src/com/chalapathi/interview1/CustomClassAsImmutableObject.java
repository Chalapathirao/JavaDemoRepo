package com.chalapathi.interview1;

public class CustomClassAsImmutableObject {

    private final Student1 student;
    private final String phNo;

    public CustomClassAsImmutableObject(Student1 student, String phNo) {
        //this.student = student;
        // Defensive copy during assignment
        this.student = new Student1(student.getAge(), student.getName());
        this.phNo = phNo;
    }

    public Student1 getStudent() {
        // return student;
        // Return a defensive copy to prevent external modification
        return new Student1(student.getAge(), student.getName());
    }

    public String getPhNo() {
        return phNo;
    }

    @Override
    public String toString() {
        return "CustomClassAsImmutableObject{" +
                "st=" + student +
                ", phNo='" + phNo + '\'' +
                '}';
    }
}

class Student1{
    private final int age;
    private final String name;

    Student1(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

class ImTest{
    public static void main(String[] args) {
        Student1 st = new Student1(5, "vikranth");
        CustomClassAsImmutableObject obj = new CustomClassAsImmutableObject(st, "7674079325");
        System.out.println(obj);
    }
}