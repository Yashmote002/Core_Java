package com.tns.String;
//Code for comparison

public class TestStringComparison {

	public static void main(String[] args) {
		String name="Yash";
		String name2="Yash";
		String nmae3=new String("Yash");
		String name4="Yash M";
		
		System.out.println(name.equals(name2));
		System.out.println(name.equals(nmae3));
		System.out.println(name2.equals(name4));
	}

}
