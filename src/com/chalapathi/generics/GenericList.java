package com.chalapathi.generics;

public class GenericList<T /*extends Number*/> {
    private T[] items = (T[]) new Object[5];
    private int count;

    public Boolean add(T item) {
        if (count <= 10) {
            items[count++] = item;
            return true;
        } else {
            return false;
        }
    }

    public T get(int index) {
        if (index >= 0 && index < count)
            return items[index];
        return null;
    }

    public int size() {
        return count;
    }

    public void printList() {
        for (T element : items) {
            if (element != null) {
                System.out.println(element);
            }
        }
    }

}

class GenericListTest {
    public static void main(String[] args) {
        GenericList<String> list = new GenericList<>();
        list.add("item1");
        list.add("item2");
        list.printList();
//        for (int i = 0; i < list.size(); i++) {
//            String item = list.get(i);
//            System.out.println(item);
//        }

        GenericList<Integer> list1 = new GenericList<>();
        list1.add(1);
        list1.add(2);
        System.out.println(list1.get(0));
        System.out.println(list1.get(61));
      //  list1.printList();
    }
}