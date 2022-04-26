package com.masai;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class MainLibrary {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Set<Library> library=new TreeSet<Library>(new Library());
		boolean check=true;
		while(check) {
			System.out.println("BookId");
			int bookId=sc.nextInt();
			System.out.println("Book name");
			String bookName=sc.next();
			System.out.println("Book Author");
			String bAuthor = sc.next();
			Library l=new Library(bookId, bookName, bAuthor);
			library.add(l);
			System.out.println("enter y if u want to exit and any key");
			String ans=sc.next();
			if(ans.charAt(0)=='y')
				check=false;
		}
		for(Library i:library) {
			System.out.println(i);
		}
	}
}
