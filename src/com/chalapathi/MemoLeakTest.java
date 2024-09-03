package com.chalapathi;

import java.util.ArrayList;
import java.util.List;

public class MemoLeakTest {
    private static List<Object> largeList = new ArrayList<>();

    public void addToList(Object obj) {
        largeList.add(obj);
    }
    public static void main(String[] args) {
        new MemoLeakTest().addToList("String1");
    }
}
