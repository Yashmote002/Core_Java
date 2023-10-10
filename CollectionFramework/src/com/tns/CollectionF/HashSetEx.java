package com.tns.CollectionF;
//Code for HastSet 

import java.util.*;

public class HashSetEx {

	public static void main(String[] args) {
		//Declaring hashset 
	   HashSet<String> hs=new HashSet<String>();
	   
//	   Adding element in hastset
	   hs.add("Yash");
	   hs.add("Sushant");
	   hs.add("Nmae1");
	   hs.add("chu");
	   hs.add("Name4");
	   
	   System.out.println(hs);
	   
//	   Removing element in set
	   hs.remove("Yash");
	   System.out.println(hs);
	   
//	   Iterating element from set
	   Iterator itr=hs.iterator();
	   
	   while(itr.hasNext()) {
		   System.out.println(itr.next());
	   }
	}

}
