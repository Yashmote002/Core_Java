package com.tns.CollectionF;
//All operations of Queue
import java.util.*;

public class QueueEx2 {

	public static void main(String[] args) {
		Queue<Integer> qw=new PriorityQueue<Integer>();
//		Add element 
		qw.add(1);
		qw.add(10);
		qw.add(50);
		
//		Offer Element
		qw.offer(90);
		
		//Iterating 
	    for(int x:qw) {
	    	System.out.println(x);
	    }
	    
	    System.out.println("The top element to be removed "+qw.poll());
	    System.out.println("No first element is : "+qw.peek());
	    System.out.println("The top element to be removed "+qw.remove());
	    System.out.println("No first element is : "+qw.element());
	    

	}

}
