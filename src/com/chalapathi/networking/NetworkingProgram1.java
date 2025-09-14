package com.chalapathi.networking;

import java.net.InetAddress;

public class NetworkingProgram1 {

	public static void main(String[] args) {
		networking1();
	}

	private static void networking1() {
		try {
			InetAddress ip = InetAddress.getByName("www.youtube.com");
			System.out.println("Host Address: " + ip.getHostAddress());
			System.out.println("Host Name: " + ip.getHostName());
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
