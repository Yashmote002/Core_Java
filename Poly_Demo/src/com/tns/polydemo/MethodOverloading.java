package com.tns.polydemo;
// polymorphism using Method Overloading ,  Polymorphism in overloading considerred as a compile time polymorphism
//Overloading means method have same names but different argumnets.
public class MethodOverloading {
	void add(int a,int b) {
		int sum =a+b;
		System.out.println(" Sum of integers "+sum);
	}
	void add(int a,float b) {
		float sum=a+b;
		System.out.println("Sum of Integer and float "+sum);
	}
	void add(double a, double b) {
		double sum=a+b;
		System.out.println("Sum of Double "+sum);
	}
  
	public static void main(String[] args) {
		MethodOverloading obj =new MethodOverloading();
		obj.add(90, 9);
		obj.add(89.7,99.88f);
		obj.add(67.7648683468d, 038747379.848d);

	}

}
