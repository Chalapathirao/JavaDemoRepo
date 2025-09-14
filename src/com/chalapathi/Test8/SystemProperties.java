package com.chalapathi.Test8;

import java.util.Properties;
import static java.lang.System.out;

public class SystemProperties {

    public static void main(String[] args) {
        Properties properties = System.getProperties();
        System.out.println(properties);
        System.out.println(properties.get("java.version"));
        System.out.println(System.getProperty("java.home"));
        properties.list(System.out);
        out.println("---------static import test-------------");

    }
}
