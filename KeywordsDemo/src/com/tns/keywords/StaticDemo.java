package com.tns.keywords;
//Code for Static Keyword.
//Static method and attributes can be accessed by without creating object of class.

class Test{
	static int Age=22;
	static void print() {
		System.out.println("This is the static method of Test class");
	}
}

public class StaticDemo {

	public static void main(String[] args) {
		System.out.println(Test.Age);
		Test.print();

	}

}
