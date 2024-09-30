package com.chalapathi.test1;


import java.io.IOException;

public class ExceptionTest {
    public static void main(String[] args) {
        try{
            int array[] = new int[10];
            array[10] = 30/0;
        }
        /*catch(ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }*/
        catch(ArithmeticException e2){
            System.out.println(e2.getMessage());
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
