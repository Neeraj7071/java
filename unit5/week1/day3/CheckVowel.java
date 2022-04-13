package com.masai;

public class CheckVowel{
	static void authenticate(char inputchar) {
		String str="bcdfghjklmnpqrstvwxyz";
		if(inputchar=='A'||inputchar=='E'||inputchar=='I'||inputchar=='O'||inputchar=='U'||inputchar=='a'||inputchar=='e'||inputchar=='i'||inputchar=='o'||inputchar=='u')
		System.out.println("vowel");
		else {
			boolean condition=false;
				for(int i=0;i<str.length();i++) {
				if(inputchar==str.charAt(i)) {
					condition =true;
					break;
				}
			}
				if(condition) {
					System.out.println("consonant");
				}
				else {
					System.out.println("error");
				}
			}
	}
	public static void main(String[] args) {
		CheckVowel.authenticate('h');
		CheckVowel.authenticate('a');
		CheckVowel.authenticate('%');
	}
}
