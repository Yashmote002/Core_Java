package com.tns.annotations;
//Code for Annotation 
//Annotations used for to provide supplemental information about a program. \
class Animal{
	void eat(){
		System.out.println("All animals eat something");
	}
}

class Dog extends Animal{
	@Override void eat() {
		System.out.println("Dog eat something");
	}
}

public class AnnoationDemo1 {

	public static void main(String[] args) {
		Dog obj1=new Dog();
		obj1.eat();
		

	}

}
