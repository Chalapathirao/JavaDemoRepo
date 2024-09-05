package com.chalapathi.test1;


class FinalMethodTestBike {
    final void run() {
        System.out.println("running...");
    }
}

public class FinalMethodHonda extends FinalMethodTestBike {

    /*void run(){

    }*/ // compile time error.

  /* final static FinalMethodHonda(){

    }*/ // error

    public static void main(String[] args) {
        new FinalMethodHonda().run();
    }
}
