package com.tns.CollectionF;

import java.util.*;

//Array To List conversion example

public class ArrayToListEx {

	public static void main(String[] args) {
		String arr[]= {"NAme","YAsh","Student","Engineering"};
		
//		System.out.println("The elements in array is :");
		//Iterating using for loop
//        for(int i=0;i<arr.length;i++) {
//        	System.out.println(arr[i]);
//        }
		
		System.out.println("Prinring array is :"+Arrays.toString(arr));
		
		List<String> list=new ArrayList<String>();
		
//		logic 1
//		for(String x:arr) {
//			list.add(x);
//		}
//		System.out.println("Printing list :"+list);
		
//		logic2
		for(int j=0;j<arr.length;j++) {
			System.out.println(list.add(arr[j]));
		}
		System.out.println("Printing list :"+list);
	}

}
