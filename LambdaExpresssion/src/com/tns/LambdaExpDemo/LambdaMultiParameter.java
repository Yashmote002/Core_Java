package com.tns.LambdaExpDemo;
//Code for lambda Expression with multiple parameter.

interface MultiParameter{
	public int add(int a,int b);
}
public class LambdaMultiParameter {

	public static void main(String[] args) {
		MultiParameter obj=(a,b)->{
			return a+b;
		};
		
		System.out.println("The addition of a and b is "+obj.add(3, 9));

	}

}
