package com.chalapathi;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionChainingExample {

    public static void main(String[] args) throws IOException {
        try {
            readFile("nonexistent.txt");
        } catch (FileNotFoundException e) {
            IOException wrappedException = new IOException("Error reading file", e);
            throw wrappedException;
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void readFile(String fileName) throws IOException {
        // ... code to read the file ...
        // Replace this with your actual file reading logic
        throw new FileNotFoundException("File not found: " + fileName);
    }
}