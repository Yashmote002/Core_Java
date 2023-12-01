package com.tns.conditions;
//Code for Nested If

public class NestedIfDemo {

	public static void main(String[] args) {
		int x=30, y=11;
		if(x==30) {
			if(y==10) {
				System.out.println("Value of x=30 and y=10");
			}
			else {
				System.out.println("Value of y is not equal to 10");
			}
		}
		else {
			System.out.println("The value of x is not 30");
		}

	}

}
