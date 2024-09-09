package com.chalapathi.test4;

import java.util.ArrayList;
import java.util.List;

public class GarbageCollectionExample {
    public static void main(String[] args) {
        // Create a large list of objects
        List<String> largeList = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            largeList.add("Item " + i);
        }

        // Make the list eligible for garbage collection
        largeList = null;

        // Request garbage collection (but not guaranteed to happen immediately)
        System.gc();

        // Do other tasks while waiting for garbage collection
        System.out.println("Doing other tasks...");
        //WeakReference<StringBuilder> reference = new WeakReference<>(new StringBuilder());
    }
}
