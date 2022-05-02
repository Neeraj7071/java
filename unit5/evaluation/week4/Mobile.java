package com.masai1;
import java.util.*;
public class Mobile {
	private HashMap<String,ArrayList<String>> mobiles = new HashMap<>();
	public String addMobile(String company, String model) {
		Set<String> set=this.mobiles.keySet();
		for(String i:set) {
			if(i.equals(model)) {
				ArrayList<String> a=this.mobiles.get(i);
				a.add(model);
				this.mobiles.put(company, a);
				return "ompany name already exists";
			}
		}
		ArrayList<String> a=new ArrayList<String>();
		a.add(model);
		this.mobiles.put(company,a);
//		System.out.println(this.mobiles);
		return "Mobile added successfully";
		//this method will take a string as a company name and its model as an //argument.
		//ex: "apple", "Iphone13"
		//add the company as key and its model as an element of ArrayList in the above //mobiles HashMap.
		//if the company name already exists then their model should be added to the //existing list.
		//This method should return a message "Mobile added successfully" after //adding a mobile.
		}
	public List<String> getModels(String company)throws InvlidMobileException{
		return (List<String>)this.mobiles.get(company);
		//This method return the list of all the models of the supplied company
		//if we supply any invalid company name then it should throw a checked exception
		}
	public static void main(String[] args) {
		Mobile m=new Mobile();
		m.addMobile("apple", "Iphone13");
		m.addMobile("apple", "Iphone13");
		try {
			System.out.println(m.getModels("apple"));
			for(String i:m.getModels("Iphone13")) {
				System.out.println(i);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
//		System.out.println(m);
	}
	
}
