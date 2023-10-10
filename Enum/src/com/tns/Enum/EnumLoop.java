package com.tns.Enum;

enum level2{
	HIGH,
	MEDIUM,
	LOW;
}

public class EnumLoop {

	public static void main(String[] args) {
		for(level2 obj2:level2.values()) {
			System.out.println(obj2);
		}
		

	}

}
