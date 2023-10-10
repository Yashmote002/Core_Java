package com.tns.CollectionF;
import java.util.*;

//All operations on list

public class ListEx2 {

	public static void main(String[] args) {
		List<String> list2=new ArrayList<String>();
		
//		Add operation
		
		list2.add("Asf");
		list2.add("adsdgf");
		list2.add("Ade");
		list2.add("bbc");
		list2.add("bbc");
		
		System.out.println("Returning lidex 1 element:"+list2.get(1));
		System.out.println("The element of list before 'SET' is  :"+list2);
		
//	 Set operation 
		list2.set(1,"YAsh");
		for(int i=0;i<list2.size();i++) {
//	 Accessing element
			System.out.println(i+"st element of the list is : "+list2.get(i));
		}
		
//		indedxOf 
		int index=list2.indexOf("YAsh");
		System.out.println("Index of YAsh is :"+index);
		
//		LastIndexOf
		int LastIndex=list2.lastIndexOf("bbc");
		System.out.println("Last index of 'bbc' is "+LastIndex);
		
//		remove 
		list2.remove(1);
		System.out.println("After the removing of objects :"+list2);
		
		boolean isPresent=list2.contains("YAsh");
		System.out.println("The YAsh is present or not in List :"+isPresent);

	}

}
