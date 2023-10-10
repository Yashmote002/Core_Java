package com.tns.StreamApiDemo;
//Code for StreamAPI

import java.util.*;

class Product{
	int id;
	String name;
	float price ;
	
	public Product(int id,String name,float price) {
		this.id=id;
		this.name=name;
		this.price=price;
	}
}

public class StreamExample {

	public static void main(String[] args) {
		List<Product> productlist=new ArrayList<Product>();
		productlist.add(new Product(1,"p1",90f));
		productlist.add(new Product(1,"p2",100f));
		productlist.add(new Product(1,"p2",900f));

		List<Float> productPriceList=new ArrayList<Float>();
		
		for(Product product:productlist) {
			if(product.price<110) {
				productPriceList.add(product.price);
			}
		}
		System.out.println(productPriceList);
	}

}
