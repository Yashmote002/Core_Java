package com.tns.LambdaExpDemo;
// Code for Lambda ForEach expression. 

import java.util.*;

public class LambdaForEach {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
			list.add("Name");
            list.add("Addrress");
            list.add("Age");
            list.add("Roll No");
            
            list.forEach(
            		(n)->System.out.println(n)
            		);

	}

}
