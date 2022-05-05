package com.masai;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;
import java.util.Scanner;

public class Main1 {

	public static void main(String[] args){
		Address1 e1Address=new Address1("up", "lalitpur", "567833");
		Student1 e1=new Student1(1, "Neeraj", e1Address, "neeraj@gmail.com", "jhtguilkj");
		BufferedWriter e1file;
		File e1File=new File("emp.txt");
		try {
			FileWriter e1F = new FileWriter("student.txt");
			e1F.write(e1.toString());
			e1F.close();
			System.out.println("Done");
			// TODO Auto-generated catch block
		} catch (IOException e) {
			System.out.println(e);
		}


		
		
	}
}
