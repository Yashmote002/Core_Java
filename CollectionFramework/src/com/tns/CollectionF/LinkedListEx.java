package com.tns.CollectionF;
//Code for LinkedList using iterator
import java.util.*;

public class LinkedListEx {

	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<String>();
//		Adding elements in linked list
        ll.add("Name");
        ll.add("Name1");
        ll.add("Name2");
        ll.add("Name3");
        ll.add("Name4");
        
//        Iterating using iterator
        Iterator<String> itr=ll.iterator();
        while(itr.hasNext()) {
        	System.out.println(itr.next());
        }  
        
        ll.remove("Name");
        ll.remove(1);
        
        System.out.println("After removing  from ll"+ll);
        
        ll.addFirst("Yash");
        ll.addLast("002");
        
        System.out.println("After adding elements at first and last "+ll);
	}

}
