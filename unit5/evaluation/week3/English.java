package com.masai;

import java.util.*;
class English {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student's Article");
		String str=sc.nextLine();
		String newstr="";
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==',' ||str.charAt(i)==';' ||str.charAt(i)==':' ||str.charAt(i)=='.' ||str.charAt(i)=='?' ||str.charAt(i)=='!' );
			else {
				newstr+=str.charAt(i);
			}
		}
		String[] strar=newstr.split(" ");
		SortedSet strnew=new TreeSet();
		for(int i=0;i<strar.length;i++) {
			strnew.add(strar[i].toLowerCase());
		}
		System.out.println("Number of words"+(strar.length+1));
		System.out.println("Number of unique words"+(strnew.size()+1));
		System.out.println("The words are");
		int count=1;
		for(Object i:strnew) {
			System.out.println((count)+". "+i);
			count++;
		}
	}
}
