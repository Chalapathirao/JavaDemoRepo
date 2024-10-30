package com.chalapathi.multithreading;

public class CoreSizes {
    public static void main(String[] args) {
        System.out.println("Number of available cores: " + Runtime.getRuntime().availableProcessors());
        System.out.println("Free memory: " + Runtime.getRuntime().freeMemory() / (1024 * 1024) + " MB");
        System.out.println("Total memory: " + Runtime.getRuntime().totalMemory() / (1024 * 1024) + " MB");
        System.out.println("Max memory: " + Runtime.getRuntime().maxMemory() / (1024 * 1024) + " MB");
        System.out.println("Used memory: " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / (1024 * 1024) + " MB");
    }
}
