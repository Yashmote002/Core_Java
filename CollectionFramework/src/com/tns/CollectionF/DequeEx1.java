package com.tns.CollectionF;
//Code for Deque (double ended queue) ,all  operations

import java.util.*;

public class DequeEx1 {

	public static void main(String[] args) {
		Deque<String> dq=new ArrayDeque<String>();
		
//		Adding element
		dq.add("Yash");
		dq.offer("Mote");
		dq.addFirst("Sohan");
		dq.addFirst("Dalvi");
		dq.addLast("Chirag");
		
		System.out.println(dq);
		//Accessing peek/first element from Deque
		System.out.println("Peek element from deque is : "+dq.peek());
		
		dq.remove();//Remove front element in queue
		System.out.println(dq);
		
		dq.poll();
		System.out.println(dq);//Remove front element in queue
		
		//Removing first/peek element from queue
	    dq.pollFirst();
//	    Removing last element from queue
	    dq.pollLast();
	    
	    
//	    Iterating element from deque
	    System.out.println("elements from deque: ");
	    Iterator itr=dq.iterator();
	    while(itr.hasNext()) {
	    	System.out.println(itr.next());
	    }
	    
	    
}

}
