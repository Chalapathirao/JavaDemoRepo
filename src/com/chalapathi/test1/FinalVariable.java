package com.chalapathi.test1;

public class FinalVariable {
    final int speedlimit = 90;//final variable
    final int blankFinal;
    final static int staticFinal;
    FinalVariable(){
        System.out.println("constructor");
        // blankFinal = 100;  // correct
        // staticFinal =6000; error
    }

    {
        blankFinal = 200; // correct
    }

    static {
        staticFinal = 500;
    }

    void run() {
        System.out.println("run method");
        // speedlimit=400; //error
        // blankFinal = 300; //error
       // staticFinal =600; //error
    }

    int cube(final int n){
      //  n=n+2;//can't be changed as n is final
        return n*n*n;
    }

    public static void main(String[] args) {
        FinalVariable obj = new FinalVariable();
        obj.run();
    }
}
