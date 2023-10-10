package com.tns.Arrays;
//code for 2D array
import java.util.Scanner;
public class ArrayEx7 {

	public static void main(String[] args) {
		int a[][]=new int[2][3];  //first [] is for row,and second [] is for column;
 		Scanner sc=new Scanner(System.in);
 		System.out.println("Enter elements in array");
 		
 		for(int i=0;i<2;i++)  //Rows 
 		{
 			for(int j=0;j<3;j++) //Column
 			{
 				int p=a[i][j];
 				System.out.print("Enter value for Object"+p);
 				a[i][j]=sc.nextInt();
 			}
// 			System.out.println("\n");
 		}
 		
 		System.out.println("Enetered values are :");
 		for(int i=0;i<2;i++) {
 			for(int j=0;j<3;j++) {
 				int p=a[i][j];
 				System.out.print(a[i][j]);
 			}
 			System.out.println("\n");
 		}
 		

	}

}
