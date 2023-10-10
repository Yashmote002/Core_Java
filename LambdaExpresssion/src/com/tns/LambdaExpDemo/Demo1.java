package com.tns.LambdaExpDemo;
//Code for lambda and accessing interface from another class of same package.

public class Demo1 {

	public static void main(String[] args) {
		Demo d=()->{
			System.out.println("The Statement");
		};
		
		d.draw();

	}

}
