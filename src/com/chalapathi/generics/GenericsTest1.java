package com.chalapathi.generics;

public class GenericsTest1 {
    public static void main(String[] args) {
        Box<String> box = new Box<>("items");
        System.out.println(box.getItem());
        Integer[] intArray = {1, 2, 3};
        //box.printArray(intArray);
    }
}

class Box<T> {
    private T item;

    public Box(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element);
        }
    }
}