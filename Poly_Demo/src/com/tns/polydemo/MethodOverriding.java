package com.tns.polydemo;
//Method Overriding consist methods have same name and same arguments during code using SUPER keyword.
//This Overriding polymorphism also known as Run time polymorphism.

class Shape{
	void draw() {
		System.out.println("The shape not defined");
	}
}

class Rectangle extends Shape{
	void draw() {
		super.draw();
		System.out.println("The shape is Rectangle");
	}
}
class Circle extends Shape{
	void draw() {
//		super.draw();
		System.out.println("The shape is Circle");
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		Rectangle obj=new Rectangle();
	    obj.draw();
	

	}

}
