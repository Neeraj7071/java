package com.masai;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main2 {
	public static void main(String[] args) throws IOException {
		//buffer
		BufferedReader br=new BufferedReader(new FileReader("student.txt"));
		String line=br.readLine();
		while(line != null){
			System.out.println(line);
			line=br.readLine();
		}
		br.close();
		//file
		FileReader fr=new FileReader("student.txt");
		int i=fr.read();
		while( i != -1) {
		System.out.print((char) i);
		i = fr.read();
		}
		//file class
		Path p = Paths.get("student.txt");
		List<String> list= Files.readAllLines(p);
		System.out.println("Reading from the file");
		for(String j:list) {
		System.out.println(j);
		}



	}

}
