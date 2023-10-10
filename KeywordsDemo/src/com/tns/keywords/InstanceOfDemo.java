package com.tns.keywords;
//Code for InstanceOd keyword 
//Used to identify the mentioned variable instance of which object/method/class/interface

class Test{
    
}
public class InstanceOfDemo extends Test{

	public static void main(String[] args) {
		InstanceOfDemo obj=new InstanceOfDemo();
		System.out.println(obj instanceof Test);//checking child obj instanceof for parent Test class .
	}

}
