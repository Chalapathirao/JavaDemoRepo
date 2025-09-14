package com.chalapathi.newfeatures.java8;

interface sayableF2{  
    void say(String msg);   // abstract method  
}  
//Invalid Functional Interface
@FunctionalInterface  
interface Doable1 extends sayableF2{  
    // Invalid '@FunctionalInterface' annotation; Doable is not a functional interface  
    //void doIt();  
}  