package com.tns.Static;
//code for Static keyword
//If static keyword is used before any method ,then we can access that methods without creating objects. 

class StatDemo{
	static String Name="Yash";
	static void print() {
		System.out.println("The code for Static Keyword");
	}
}

public class Static_Demo {

	public static void main(String[] args) {
		System.out.println(StatDemo.Name);
        StatDemo.print();
	}

}
