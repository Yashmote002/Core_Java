package com.tns.annotations;

import java.util.ArrayList;

//Code for Suppress annotation warning , which helps compiler to neglet a warnings of particular type of class or objects.

public class AnnotationDemo2 {
    @SuppressWarnings({"unchecked","rawtypes"})
	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add("name1");
		list.add("name2");
		list.add("name3");
		list.add("name4");
		
		for (Object obj:list) {
			System.out.println(obj);
		}
		

	}

}
