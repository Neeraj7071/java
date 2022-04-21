package com.masai;

public class ZImpl implements Z  {

	@Override
	public void abstractX() {
		// TODO Auto-generated method stub
		System.out.println("inside abstact x");
	}

	@Override
	public void abstractY() {
		// TODO Auto-generated method stub
		System.out.println("inside abstact y");
	}

	@Override
	public void abstractZ() {
		// TODO Auto-generated method stub
		System.out.println("inside abstact z");
	}
	public static void main(String[] args) {
		ZImpl z1=new ZImpl();
		z1.abstractX();
		z1.abstractY();
		z1.abstractZ();
		Y.staticY();
		X.staticX();
		Y.Y();
		X.X();
	}

}
