package com.masai;

import java.util.Scanner;

public class Java {

	static void method(String companyName,String modelName) {
		String[] outdatedModels = {"note4","note5","note6","note7"};
		for(String i:outdatedModels) {
			if(i.equals(modelName)) {
				System.out.println(i+"_OUTDATED");
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter conpany name");
		String companyName=sc.next();
		System.out.println("Enter model Name");
		String modelName=sc.next();
		method(companyName, modelName);
	}
}
