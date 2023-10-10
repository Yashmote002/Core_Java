package com.tns.LambdaExpDemo;
//Code for lambda Expression which don't have any parameter.


interface Sayable{
	public String say();
}

public class LambdaNoParameter {

	public static void main(String[] args) {
		
		Sayable S=()->{
			return "I Nothing to say";
		};
		
		System.out.println(S.say());
		
		

	}

}
