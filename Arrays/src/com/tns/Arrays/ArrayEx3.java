package com.tns.Arrays;
import java.util.Scanner;

public class ArrayEx3 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array which you want");
		int Size=sc.nextInt();	
		int userN[]=new int[Size];
		
		for(int position=0;position<Size;position++) {
			System.out.println("Enter "+position+"th postion no:");
			int number=sc.nextInt();
			userN[position]=number;
		}
		for(int i=0;i<Size;i++) {
			System.out.println("Position : "+i+" Value : "+userN[i]);
		}

	}

}
