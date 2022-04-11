package com.masai;
public class DayOfWeek {

public static void main(String[] args) {
		//Assume these could have any value:
		int dayOfTheWeek = 6;
		boolean holiday = false;
		if((dayOfTheWeek==1 ||dayOfTheWeek==2 ||dayOfTheWeek==3 ||dayOfTheWeek==4||dayOfTheWeek==5)&& !holiday) {
			System.out.println("Wake up at 7:00");
		}
		else if(dayOfTheWeek==6 ||dayOfTheWeek==7|| holiday) {
			System.out.println("Sleep in!");
		}
	}
}