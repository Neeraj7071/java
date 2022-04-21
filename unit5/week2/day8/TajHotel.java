package com.masai;

public class TajHotel implements Hotel {
	public void welcomeDrink(){
		System.out.println("Welcome Drink from the TajHotel");
		}

	@Override
	public void chickenBiryani() {
		// TODO Auto-generated method stub
		System.out.println("ChickenBiryani from Taj hotel");
	}

	@Override
	public void masalaDosa() {
		// TODO Auto-generated method stub
		System.out.println("Masala Dosa from Taj hotel");
	}
}
