package com.masai;
public class ScheduleOfWeek {
	
		public static void main(String[] args) {
			//Assume this can have any value from 1 to 7:
			int dayOfWeek = 1;
			//TODO: declare a String variable called schedule.
			//TODO: write a switch statement that give schedule a different
			//value for each day of the week based on the dayOfWeek variable.
			//Don’t forget to "break" after each case, and don’t forget to
			//provide a default case!
			switch(dayOfWeek){
			case 1:
				System.out.println("Gym in the morning.");
				break;
			case 2:
				System.out.println("Class after work.");
				break;
			case 3:
				System.out.println("Meetings all day.");
				break;
			case 4:
				System.out.println("Work from home.");
				break;
			case 5:
				System.out.println("Game night after work.");
				break;
			case 6:
				System.out.println("Free!");
				break;
			case 7:
				System.out.println("Free!");
				break;
			default:
				System.out.println("decide what to assign schedule for each day based on your own weekly.");
				break;
				}
		}
}