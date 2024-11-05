package com.chalapathi.generics;

public class GenericTest2<T> {
    private T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public static <T> void printItem(T item) {
        System.out.println(item);
    }

    public void showType() {
        System.out.println("Type: " + item.getClass().getName());
    }
}

class GenericTest2Test {
    public static void main(String[] args) {
        GenericTest2<String> test = new GenericTest2<>();
        test.setItem("item1");
        System.out.println(test.getItem());
        GenericTest2.printItem("item2");
       test.showType();

        GenericTest2<Integer> test1 = new GenericTest2<>();
        test1.setItem(1);
        System.out.println(test1.getItem());
        GenericTest2.printItem(2);
        test1.showType();
    }
}