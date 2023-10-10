package com.tns.CollectionF;
//All operations of Queue
import java.util.*;

public class QueueEx {

	public static void main(String[] args) {
		Queue<String> qw=new LinkedList<String>();
//		Add element 
		qw.add("Name");
		qw.add("Name1");
		qw.add("Name2");
		
//		Offer Element
		qw.offer("Name3");
		
		//Iterating 
	    for(String x:qw) {
	    	System.out.println(x);
	    }
	    
	    System.out.println("The top element to be removed "+qw.poll());
	    System.out.println("No first element is : "+qw.peek());
	    System.out.println("The top element to be removed "+qw.remove());
	    System.out.println("No first element is : "+qw.element());
	    

	}

}
