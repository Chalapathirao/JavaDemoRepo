package com.chalapathi.demo1;

import java.net.*;

public class InetDemo {
	public static void main(String[] args) {
		try {
			InetAddress ip = InetAddress.getByName("192.168.108.177");

			System.out.println("Host Name: " + ip.getHostName());
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
