package com.tns.Arrays;
//code for getting sum of elements of array;

import java.util.Scanner;

public class ArrayEx6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum=0;
	    
		System.out.println("Enter length of array :");
		int length=sc.nextInt();
		
		int number[]=new int[length];
		
		for(int i=0;i<number.length;i++) {
			System.out.println("Enter the number for "+i+"th position");
			int position=sc.nextInt();	
			number[i]=position;
			}
		System.out.println("The elements in array is:");
		
		for(int j=0;j<number.length;j++) {
			System.out.println(number[j]);
		}
		
		
		for(int k=0;k<number.length;k++) {
			sum=sum+number[k];
		}
		System.out.println("The sum of all elements in array is: "+sum);
	}
	
	

}
