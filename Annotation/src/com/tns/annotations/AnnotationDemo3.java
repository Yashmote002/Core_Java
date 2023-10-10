package com.tns.annotations;
//Code for Deprecated annotation , The @Deprecated annotation tells the compiler that a method, class, or field is deprecated and that it should generate a warning if someone tries to use it.

class A{
	void m() {
		System.out.println("This is method m()");
	}
	
	@Deprecated
	void n() {
		System.out.println("This is method n()");
	}
}
public class AnnotationDemo3 {

	public static void main(String[] args) {
		A obj=new A();
		obj.m();
		obj.n();

	}

}
