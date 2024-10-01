package com.chalapathi.designpattern.singleton;

class EagerInialiazationSingleTon {
    private EagerInialiazationSingleTon() {
        System.out.println("constricture");
    }

    private static final EagerInialiazationSingleTon eagerInialiazationSingleTon = new EagerInialiazationSingleTon();

    public static EagerInialiazationSingleTon getInstance() {
        return eagerInialiazationSingleTon;
    }
}


class LazyInialiazationSingleTon {
    private LazyInialiazationSingleTon() {
    }

    private static LazyInialiazationSingleTon lazyInialiazationSingleTon;

    public static LazyInialiazationSingleTon getInstance() {
        if (lazyInialiazationSingleTon == null) {
            return new LazyInialiazationSingleTon();
        }
        return lazyInialiazationSingleTon;
    }
}

class ThreadSafeSingleton {
    private ThreadSafeSingleton() {
    }

    private static ThreadSafeSingleton threadSafeSingleton;

    public static synchronized ThreadSafeSingleton getInstance() {
        if (threadSafeSingleton == null) {
            return new ThreadSafeSingleton();
        }
        return threadSafeSingleton;
    }
}

class BillPughSingleton {
    private BillPughSingleton() {
    }

    private static class SingletonHelper {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }
    public static BillPughSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }
    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }

}

public class SingleTonTest {
    public static void main(String[] args) {
        System.out.println("welcome to singleton design pattern");
        EagerInialiazationSingleTon.getInstance().hashCode();
        LazyInialiazationSingleTon.getInstance().hashCode();
        ThreadSafeSingleton.getInstance().hashCode();
        BillPughSingleton.getInstance().showMessage();
    }
}
