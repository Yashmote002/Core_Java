package com.tns.Enum;
import java.util.Scanner;


	enum Day{
		MONDAY,
		TUESDAY,
		WEDNESDAY,
		THURSDAY,
		FRIDAY,
		SATURDAY,
		SUNDAY;
	}

public class EnumCaseDemo2{
	Day day;
	
//	public TestD(Day day) { this.day = day; };
	
	 void Test1() {
		switch (day) {
		case MONDAY:
		    System.out.println("Monday");
		    break;
		    
		case TUESDAY:
			System.out.println("Tuesday");
			break;
			
		case WEDNESDAY:
			System.out.println("WEDNEDAY");
			break;
			
		case THURSDAY:
			System.out.println("THURSDAY");
			break;
			
		case FRIDAY:
			System.out.println("FRIDAY");
			break;
			
		case SATURDAY:
			System.out.println("SATURDAY");
			break;
			
		case SUNDAY:
			System.out.println("SUNDAY");
			break;
		}
	}

	public static void main(String[] args) {
	}

}
