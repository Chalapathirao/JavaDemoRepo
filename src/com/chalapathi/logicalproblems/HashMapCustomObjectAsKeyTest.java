package com.chalapathi.logicalproblems;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashMapCustomObjectAsKeyTest {
    public static void main(String[] args) {
        Map<Item, Integer> map = new HashMap<>();
        map.put(new Item("1", "2", "3"), 1);
        map.put(new Item("1", "2", "3"), 2);
        System.out.println(map);
    }
}

class Item{
    String number1;
    String number2;
    String number3;

    public Item(String number1, String number2, String number3) {
        this.number1 = number1;
        this.number2 = number2;
        this.number3 = number3;
    }

    public String getNumber2() {
        return number2;
    }

    public void setNumber2(String number2) {
        this.number2 = number2;
    }

    @Override
    public String toString() {
        return "Item{" +
                "number1='" + number1 + '\'' +
                ", number2='" + number2 + '\'' +
                ", number3='" + number3 + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return Objects.equals(number1, item.number1) && Objects.equals(number2, item.number2) && Objects.equals(number3, item.number3);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number1, number2, number3);
    }
}
