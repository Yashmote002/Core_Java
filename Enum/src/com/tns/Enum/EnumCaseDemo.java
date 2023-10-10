package com.tns.Enum;

enum level1{
	LOW,
	MEDIUM,
	HIGH;
}

public class EnumCaseDemo {

	public static void main(String[] args) {
		level1 obj1=level1.HIGH;
		
		switch(obj1) {
		case LOW:
			System.out.println("LOW");
			break;
			
		case MEDIUM:
			System.out.println("MEDIUM");
			break;
			
		case HIGH:
			System.out.println("HIGH");
			break;
		}

	}

}
