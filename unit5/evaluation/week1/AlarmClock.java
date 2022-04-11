package com.masai;

public class AlarmClock {
	int week=0;
	boolean vacation=true;
	public static void main(String[] args) {
//		If it is a vacation and weekday, print “10:00” as output.
//		If it is a vacation and weekend, print “off” as output.
//		If it is not a vacation and weekday, print “7:00” as output.
//		If it is not a vacation and weekend, print “10:00” as output.
//		If the first value is not a number between 0 and 6 OR the second value is not true or false, then print “error.
		AlarmClock a1=new AlarmClock();
		
		if((a1.week==1 ||a1.week==2 ||a1.week==3 ||a1.week==4||a1.week==5)&& a1.vacation) {
			System.out.println("10:00");
		}
		else if((a1.week==0 ||a1.week==6)&& a1.vacation) {
			System.out.println("off");
		}
		else if((a1.week==1 ||a1.week==2 ||a1.week==3 ||a1.week==4||a1.week==5)&& !a1.vacation) {
			System.out.println("7:00");
		}
		else if((a1.week==0 ||a1.week==6)&& !a1.vacation) {
			System.out.println("10:00");
		}
		else {
			System.out.println("error");
		}
	}
}
