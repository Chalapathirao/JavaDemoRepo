package com.chalapathi.demo1;

public class SingletonClass {
    private static final SingletonClass SINGLE_INSTANCE = new SingletonClass();
    private SingletonClass() {}
  public static SingletonClass getInstance() {
      return SINGLE_INSTANCE;
    }
  public static void main(String[] args) {
	  System.out.println(SingletonClass.getInstance());
  }
}

 class SingletonClass1 {
    private static SingletonClass1 SINGLE_INSTANCE = null;
    private SingletonClass1() {}
    public static SingletonClass1 getInstance() {
        if (SINGLE_INSTANCE == null) {
            synchronized (SingletonClass1.class) {
                if (SINGLE_INSTANCE == null) {
                    SINGLE_INSTANCE = new SingletonClass1();
                }
            }
        }
        return SINGLE_INSTANCE;
    }
}
 
 enum unm {
	Class1
	 
 }