package com.tns.CollectionF;
//Code for HastTable(map Concept) , All oprations
import java.util.*;

public class HashTableEx1 {

	public static void main(String[] args) {
		Hashtable<Integer,String> ht=new Hashtable<Integer,String>();
		
//		Putting element in Map Table
		ht.put(400601, "Naupada");
		ht.put(400604, "W Estate");
		ht.put(400603, "Pachapakhadi");
		ht.put(421503, "Badlapur");
		
		
//		Iteratin elements from map table
		for(Map.Entry m:ht.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
//		Remove from map table
		ht.remove(400603);
		System.out.println("After removing element from collection is :");
		
		for(Map.Entry re:ht.entrySet()) {
			System.out.println(re.getKey()+" "+re.getValue());
			
//            get Default value at specified key from map table
			System.out.println(ht.getOrDefault(421503, "Not Found"));
			
//			put element at specified key value if it is absent
			ht.putIfAbsent(421502, "Ambernath");
			
			System.out.println("updated list");
			for(Map.Entry put:ht.entrySet()) {
				System.out.println(put.getKey()+" "+put.getValue());
			}
		}

	}

}
