package com.chalapathi.Test8;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class WifiInfo {

    public static void main(String[] args) {
        try {
            String os = System.getProperty("os.name").toLowerCase();
            if (os.contains("win")) {
                // Command for Windows
                getWifiInfo("netsh wlan show interfaces");
            } else if (os.contains("mac")) {
                // Command for macOS
                getWifiInfo("networksetup -getinfo Wi-Fi");
            } else {
                System.out.println("Unsupported operating system.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void getWifiInfo(String command) {
        try {
            Process process = Runtime.getRuntime().exec(command);
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

