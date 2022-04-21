package com.masai;

public interface Y {
	void abstractY();
	static void staticY() {
		System.out.println("inside static method of Y");
	}
	public static void Y() {
		System.out.println("inside default method of Y");
	}
}
