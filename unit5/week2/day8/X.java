package com.masai;

public interface X {
	void abstractX();
	static void staticX() {
		System.out.println("inside static method of x");
	}
	public static void X() {
		System.out.println("inside default method of x");
	}
}
