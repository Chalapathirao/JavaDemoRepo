package com.chalapathi.corejava;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Generics {

	public Generics() {
		// TODO Auto-generated constructor stub
	}
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		List list = new ArrayList();    
		list.add(10);  
		list.add("10"); 
	}

}
