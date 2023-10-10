package com.tns.CollectionF;
//Code for List interface

import java.util.*;

public class ListEx1 {

	public static void main(String[] args) {
       List<String> list=new ArrayList<String>();
       
       list.add("Mango");
       list.add("Banana");
       list.add("Apple");
       list.add("Papaya");
       
       for(String fruits:list) {
    	   System.out.println(fruits);
       }
	}

}
