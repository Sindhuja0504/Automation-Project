package com.basic;

import java.sql.DriverManager;

public class Basic {
	
	static String  url= "jdbc:postgresql://192.168.1.57:5432/mosip_prereg";
	static String name ="postgres";
	static String password="YJEJZbXMMbiDWSEconeCnA";
	
	public static void main(String[] args) {
		
		java.sql. Connection connect=null;
		
		try {
			Class.forName("org.postgresql.Driver");
			connect =  DriverManager.getConnection(url, name, password);
			System.out.println("connected");
		} catch (Exception e) {
			
			System.out.println(e);
			System.out.println("not connected");
		}
		
	}
	
	
	



}
