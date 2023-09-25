package com.tns.conditions;
//code for ElseIf ladder

public class ElseIfLadder {

	public static void main(String[] args) {
		String city="Mumbai";
		
		if(city=="Delhi") {
			System.out.println("Your city is Delhi");
		}
		else if(city=="Pune") {
			System.out.println("Your city is Pune");
		}
		else if(city=="Nashik") {
			System.out.println("Your city is Nashik");
		}
		else {
			System.out.println(city);
		}

	}

}
