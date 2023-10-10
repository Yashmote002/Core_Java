package com.tns.keywords;
//code for Super Keyword .
//Super Keyword mainly used for getting  access of base/parent class methods as well as objetcts .
//For that super keyword is used.

class Base{
	//Code use super with variable
	int MaxSpeed=120;
}

class Child extends Base{
	int MaxSpeed=180;
	
	void Print() {
		System.out.println("The Child class value :"+MaxSpeed);
		System.out.println("The  Base class value :"+super.MaxSpeed);//Prints variable value from base class.
	}
}
public class Super_Demo {

	public static void main(String[] args) {
		Child Obj1=new Child();
		Obj1.Print();
	}

}
