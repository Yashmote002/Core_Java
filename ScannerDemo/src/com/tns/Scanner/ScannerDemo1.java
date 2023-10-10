package com.tns.Scanner;
import java.util.Scanner;
//code for Scanner class , through which we are able to take inputs from users .

public class ScannerDemo1 {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		String Name;
		int Age;
		int Mobile;
		float Percentage;
		
	    System.out.println("Enter your Name: ");
	    Name=obj.next();
	    System.out.println("Enter your Age: ");
	    Age=obj.nextInt();
	    System.out.println("Enter your Mobile No: ");
	    Mobile=obj.nextInt();
	    System.out.println("Enter your Percentage: ");
	    Percentage=obj.nextFloat();
	    
	    System.out.println("Entered  Name: "+Name);
	    System.out.println("Entered  Age: "+Age);
	    System.out.println("Entered  MobileNo: "+Mobile);
	    System.out.println("Entered  Percentage: "+Percentage);
	    

	}

}
