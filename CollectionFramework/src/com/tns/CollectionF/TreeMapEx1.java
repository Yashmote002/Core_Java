package com.tns.CollectionF;
//Code for Tree Map , All operations 

import java.util.Map;
import java.util.TreeMap;

public class TreeMapEx1 {

	public static void main(String[] args) {
		TreeMap<Integer,String> tm=new TreeMap<Integer,String>();
		
//		Adding element in Map 
		tm.put(1, "Aptitute");
		tm.put(2, "Coding");
		tm.put(3, "Communication");
		tm.put(4,"HR");
		tm.put(5, "CTC");
		tm.put(6, "Offer");
		
//		Iterating
		System.out.println("Initial Tree Map");
		for(Map.Entry x:tm.entrySet()) {
			System.out.println(x.getKey()+" "+x.getValue());
		}
		
//		Removing elements from Map
		tm.remove(2);
		tm.remove(4);
		
		System.out.println("After removing element from map "+tm);
		
		//
		System.out.println("HeadMap "+tm.headMap(1,true));
		//
		System.out.println("TailMap "+tm.tailMap(1,true));
		
		//Priring submap, printing value only if value is present in Map and mentioned as TRUE in submap
		System.out.println("subMap: "+tm.subMap(1, false, 4, true));
		
//		Printing elements of Map in reverse/descending order
		System.out.println("The descebding order of elements in Map is: "+tm.descendingMap());

	}

}
