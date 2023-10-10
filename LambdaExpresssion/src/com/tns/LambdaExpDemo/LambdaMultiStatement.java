package com.tns.LambdaExpDemo;
// Code for Lambda which have multiple statements.

interface MultiStatemnt{
	public String Noti(String message);
}

public class LambdaMultiStatement {

	public static void main(String[] args) {
		MultiStatemnt person=(message)->{
			String str1="I would like to say,";
			String str2=str1+message;
			return str2;
		};
		
		System.out.println(person.Noti("Time is precious"));

	}

}
