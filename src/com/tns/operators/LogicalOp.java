package com.tns.operators;
//Code for Logical operator like AND ,OR,NOT

public class LogicalOp {

	public static void main(String[] args) {
		boolean bool1=true,bool2=false;
		
		//Logical And
		System.out.println("bool1 && bool2  "+(bool1 && bool2));
        //Logical Or
		System.out.println("bool1 || bool2  "+(bool1 || bool2));
		//Logical Not
		System.out.println("!(bool1&&bool2) "+ !(bool1 && bool2));
	}

}
