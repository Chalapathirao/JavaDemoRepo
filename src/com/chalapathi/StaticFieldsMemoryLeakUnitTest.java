package com.chalapathi;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class StaticFieldsMemoryLeakUnitTest {
    public static List<Double> list = new ArrayList<>();
    static Logger log = Logger.getLogger("StaticFieldsMemoryLeakUnitTest");

    public void populateList() {
        for (int i = 0; i < 10000000; i++) {
            list.add(Math.random());
        }
        log.info("Debug Point 2");
    }

    public static void main(String[] args) {
        log.info("Debug Point 1");
        new StaticFieldsMemoryLeakUnitTest().populateList();
        log.info("Debug Point 3");
    }
}
