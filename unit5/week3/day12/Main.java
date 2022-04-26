package com.masai;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	private String key;
	private String value;
	public Main() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Main(String key, String value) {
		super();
		this.key = key;
		this.value = value;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Map<String,String> city=new LinkedHashMap<String,String>(); 
		while(city.size()<5) {
			System.out.println("Enter State");
			String state=sc.next();
			System.out.println("Enter capital");
			String cap=sc.next();
			city.put(state, cap);
		}
		for(Map.Entry<String,String>it:city.entrySet())
	          System.out.println("State "+it.getKey()+" Capital"+it.getValue()+" ");
	    
	}
}
