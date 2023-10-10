package com.tns.LambdaExpDemo;
//Code for Lambda expressions with Single parameter.

interface SingleParameter{
	public String say(String Name);
}

public class LmabdaSingleParameter {

	public static void main(String[] args) {
		SingleParameter s=(name)->{
			return "Name is "+name;
		};
		
		System.out.println(s.say("Yash"));
		
		SingleParameter obj=name ->{
			return "The surname is "+name;
		};
		
		System.out.println(obj.say("Mote"));

	}

}
