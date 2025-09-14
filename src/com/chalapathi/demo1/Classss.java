package com.chalapathi.demo1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Classss {

	public static void main(String[] args) throws ClassNotFoundException {
		Class c=Class.forName("com.chalapathi.demo1.ArrayList6");  
		 System.out.println(c.getName()); 
		// Connection connection = DriverManager.getConnection(url, user, password);
		// Statement statement=connection.createStatement();
		// statement.execute(sql);
		 
	}

}
