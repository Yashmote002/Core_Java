package com.tns.Enum;
//An enum is a special "class" that represents a group of constants (unchangeable variables, like final variables).

enum level{
	LOW,
	MEDIUM,
	HIGH;
}

public class EnumDemo {

	public static void main(String[] args) {
	    level obj=level.HIGH;
	    System.out.println(obj);
	    level obj1=level.LOW;
	    System.out.println(obj1);
	    level obj2=level.MEDIUM;
	    System.out.println(obj2);

	}

}
