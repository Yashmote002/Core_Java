package com.tns.Abstract;
// Code for Abstraction , mostly it is help to present only data which need to present/show/display ,otherwise it hides other unwanted data 
//abstract keyword used to implement in this our code .

abstract class Shape{
	abstract void Area();
	abstract void color();
	
}

class Rectangle extends Shape{
	void Area() {
		System.out.println("The Area of Rectangle is: ");
	}
	void color() {
		System.out.println("The color of the rectangle is: ");
	}
}


abstract class circle extends Shape{
	void Area() {
		System.out.println("The Area of circle is: ");
	}
} 
public class AbstractDemo1 {
	public static void main(String []args) {
		Shape Obj1=new Rectangle();
	    Obj1.Area();
	    Obj1.color();
	}

}
