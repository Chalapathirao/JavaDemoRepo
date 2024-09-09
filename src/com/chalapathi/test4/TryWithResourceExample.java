package com.chalapathi.test4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourceExample {
    public static void main(String[] args) {
        traditionalApproach();
        tryWithResourceJava7();
    }

    private static void traditionalApproach(){
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("example.txt"));
            // Read from the file
        } catch (IOException e) {
            System.err.println("An error occurred....: " + e.getMessage());
        } finally {
            System.out.println("finally block");
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static void tryWithResourceJava7() {
        String path = "example.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
