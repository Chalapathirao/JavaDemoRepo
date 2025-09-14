package com.chalapathi.newfeatures.java8;

import java.util.Base64;
import java.util.Base64.Encoder;
public class EncDecTest {

	public EncDecTest() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
        Encoder encoder = Base64.getEncoder();
		String str = encoder.encodeToString("JavaTpoint".getBytes());  
        System.out.println("Encoded string: "+str); 
        
        Base64.Decoder decoder = Base64.getDecoder();  
        // Decoding string  
        String dStr = new String(decoder.decode(str));  
        System.out.println("Decoded string: "+dStr);  
	}
}
