package com.masai1;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the ticketId");
		int id =sc.nextInt();
		System.out.println("Enter the price");
		int price=sc.nextInt();
		System.out.println("Enter the no of tickets");
		int at=sc.nextInt();
		Ticket t1=new Ticket(id,price,at);
		System.out.println("Entwr no of bookings");
		System.out.println("Total amount"+t1.calculateTicketCost(sc.nextInt()));
		System.out.println("Available ticket after booking:"+t1.availableTickets);
	}
}

class Ticket{
	 int ticketid;
	 int price;
	 int availableTickets;
	 
	 public int calculateTicketCost(int nooftickets) {
		 if(nooftickets<=this.availableTickets) {
			 this.availableTickets-=nooftickets;
			 return nooftickets*this.price;
		 }
		return -1;
	 }

	public Ticket(int ticketid, int price, int availableTickets) {
		super();
		this.ticketid = ticketid;
		this.price = price;
		this.availableTickets = availableTickets;
	}
}