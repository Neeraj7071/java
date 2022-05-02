package com.masai1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;
import java.util.Scanner;

public class Main3 {

	public static void main(String[] args){
		Address3 e1Address=new Address3("up", "lalitpur", "567833");
		Employee3 e1=new Employee3(1, "Neeraj", e1Address, "neeraj@gmail.com", "jhtguilkj");
		BufferedWriter e1file;
		File e1File=new File("emp.txt");
		try {
			FileWriter e1F = new FileWriter("emp.txt");
			e1F.write(e1.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		
		
	}
}
