package com.tns.CollectionF;
//code for Vector
import java.util.*;

public class VectorEx {

	public static void main(String[] args) {
		Vector<String> jv=new Vector<String>();
		//Add operation
        jv.add("Name");
        jv.add("Aysh");
        jv.add("Surname");
        jv.add("Id");
        
        System.out.println("Size is "+jv.size());
        System.out.println("Default capacity is : "+jv.capacity());
        
        System.out.println("The vector elements :"+jv);
      //Add Element further operation
        jv.addElement("Middle");
        jv.addElement("LastEle");
        
        System.out.println(jv);
        
        System.out.println("The first element of array is : "+jv.firstElement());
        System.out.println("The last element of array is : "+jv.lastElement());
	}

}
