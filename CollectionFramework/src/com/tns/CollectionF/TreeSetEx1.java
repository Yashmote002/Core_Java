package com.tns.CollectionF;
//Code fro TreeSet ,all operations
import java.util.*;

public class TreeSetEx1 {

	public static void main(String[] args) {
	     TreeSet<String> ts=new TreeSet<String>();
	     
	     //Adding element in Tree set
	     ts.add("Name");
	     ts.add("kkjjh");
	     ts.add("tejal");
	     ts.add("Utkarsha");
	     ts.add("Aditya");
	     
//	     Printing/Iterating Tree set
	     System.out.println("Elements in Tree Set");
	     for(String x:ts) {
	    	 System.out.println(x);
	     }
	     
	     //Remove element from set
	     System.out.println("The element is removed is "+ts.remove("kkjjh"));
	     
	     System.out.println("Remaining elements in ascending order is "+ts);
	     
//	     Reversing elements from set by descending set
         System.out.println("The element in reverse/descending  order is "+ts.descendingSet());
         
         System.out.println("Head Set is C ? "+ts.headSet("Name",true));
         System.out.println("Head Set is C ? "+ts.tailSet("Name",true));
	}

}
