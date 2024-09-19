package com.chalapathi.test7;

class OuterClass {
    int x = 10;

    class InnerClass {
        int y = 5;
    }

    /*private class InnerClass1 {
        int y = 5;
    }*/

    static class InnerClass2 {
        int y = 5;
    }
}

public class InnerTest1 {
    public static void main(String[] args) {
        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = myOuter.new InnerClass();
        System.out.println(myInner.y + myOuter.x);

//        OuterClass.InnerClass1 myInner1 = myOuter.new InnerClass1();
//        System.out.println(myInner1.y + myOuter.x);

        OuterClass.InnerClass2 myInner2 = new OuterClass.InnerClass2();
        System.out.println(myInner2.y);
    }
}
