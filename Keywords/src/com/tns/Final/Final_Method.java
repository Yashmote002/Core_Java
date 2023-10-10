package com.tns.Final;
//Code for Final Method 
//If final keyword is ued befor any class/Method then the same class/methid name is not allowed to use for any other class/method

class B{
	final void run() {
		System.out.println("Code for Final Method");
	}
}

public class Final_Method {

	public static void main(String[] args) {
		B obj1=new B();
		obj1.run();
	}

}
