package com.tns.keywords;
//Code for how to use Super Keyword with Methods.

class Base1{
	void Print() {
		System.out.println("The Base Class Method");
	}
}

class Child1 extends Base1{
	void Print() {
		System.out.println("The Child Class Method");
	}
	
	void Display() {
		Print();//Child Class Method.
		
		super.Print();//Use to print Base class method.
	}
}

public class SuperMethodDemo {

	public static void main(String[] args) {
		Child1 obj=new Child1();
		obj.Display();

	}

}
