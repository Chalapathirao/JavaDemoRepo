package com.chalapathi.test1;

public  class CustomException extends  Exception{

    CustomException(String message){
        super(message);
    }

    public static void main(String[] args) {
        try {
            throw new CustomException("Input not valid");
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
        throw new CustomUncheckedException("valid output");
    }
}

class CustomUncheckedException extends RuntimeException{
    public CustomUncheckedException(String message) {
        super(message);
    }
}
