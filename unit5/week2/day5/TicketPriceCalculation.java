package com.masai;

import java.util.Scanner;

public class TicketPriceCalculation {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Ticket t=new Ticket();
		System.out.print("Enter the ticketid: ");
		t.setTicketid(sc.nextInt());
		System.out.print("Enter the price: ");
		t.setPrice(sc.nextInt());
		System.out.print("Enter the no of tickets: ");
		int noOfTicket=sc.nextInt();
		System.out.print("Available tickets: ");
		t.setAvailableTickets(sc.nextInt());
		int totalPrice=t.calculateTicketCost(noOfTicket);
		System.out.println("Total amount: "+totalPrice);
		int availableTicket=t.getAvailableTickets();
		System.out.println("Available ticket after booking: "+availableTicket);
	}
}

class Ticket{
	private int ticketid;
	private int price;
	private  int availableTickets;
	public int getTicketid() {
		return ticketid;
	}
	public void setTicketid(int ticketid) {
		this.ticketid = ticketid;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getAvailableTickets() {
		return availableTickets;
	}
	public void setAvailableTickets(int availableTickets) {
		this.availableTickets = availableTickets;
	}
	public Ticket() {
		
	}
	
	public Ticket(int ticketid, int price,int availableTickets ) {
		this.ticketid=ticketid;
		this.price=price;
		this.availableTickets=availableTickets;
	}
	public int calculateTicketCost(int nooftickets) {
		if(nooftickets<=this.availableTickets) {
			this.availableTickets=this.availableTickets-nooftickets;
			return this.price*nooftickets;
		}
		else
			return -1;
	}

}

