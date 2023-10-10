package com.tns.CollectionF;
//Code for all operations related to ArrayList .

import java.util.*;

public class ArrayListEx {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		System.out.println("Enter the size of array :");
		int size=sc.nextInt();
		
		for(int i=0;i<size;i++) {
			System.out.println("Enter the elements to be add: ");
			int element=sc.nextInt();
//			Add operation
			list.add(element);
		}
		
//		Iterating the ArrayList using for loop
		for(int j=0;j<list.size();j++) {
//			get() operation 
			System.out.println(j+"st element of the ArrayList is :"+list.get(j));
		}
	}

}
