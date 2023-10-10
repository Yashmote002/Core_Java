package com.tns.Arrays;
import java.util.Scanner;

public class ArrayEx5 {

	public static void main(String[] args) {
		int a[]=new int[6];
		int b[]=new int[6];
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value in the First Array");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		
		System.out.println("Enetered element in first array: ");
		
		for(int j=0;j<=5;j++) {
			System.out.println(a[j]);
		}
		
		System.out.println("Element in second array is :");
		for(int k=0;k<a.length;k++) {
			System.out.println(b[k]=a[k]);
		}

	}

}
