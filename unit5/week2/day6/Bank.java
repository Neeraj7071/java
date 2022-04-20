package com.masai;

public class Bank {
	private String branchName;
	private String ifscCode;
	public void displayDetails(){
		System.out.println("Branch Name"+this.branchName);
		System.out.println("Ifsc Code"+this.ifscCode);
	}
	public Bank(String branchName, String ifscCode) {
		super();
		this.branchName = branchName;
		this.ifscCode = ifscCode;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public String getIfscCode() {
		return ifscCode;
	}
	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}
}
