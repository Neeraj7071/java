package com.masai;

public class AxisBank extends Bank  {
	private double  rateOfInterest;

	public AxisBank(String branchName, String ifscCode, double rateOfInterest) {
		super(branchName, ifscCode);
		this.rateOfInterest = rateOfInterest;
	}

	public double getRateOfInterest() {
		return rateOfInterest;
	}

	public void setRateOfInterest(double rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}
	@Override
	public void displayDetails() {
		System.out.println("Branch Name"+this.getBranchName());
		System.out.println("Ifsc Code"+this.getIfscCode());
		System.out.println("Rate of Intterest"+this.rateOfInterest);
	}
	public void getCreditCard() {
		System.out.println("Get the Credit Card from the Axis bank");
	}
}
