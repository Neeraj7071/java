package com.masai;

public class cricket {
	static void totalRun(int total1s,int total2s,int total3s,int totalFours,int totalSixes) {
		int total=1*total1s+2*total2s+3*total3s+4*totalFours+6*totalSixes;
		System.out.println(total);
	}
	
	public static void main(String[] args) {
		int total1s=5;
		int total2s=4;
		int total3s=2;
		int totalFours=3;
		int totalSixes=1;
		totalRun(total1s,total2s,total3s,totalFours,totalSixes);
		
	}
}
