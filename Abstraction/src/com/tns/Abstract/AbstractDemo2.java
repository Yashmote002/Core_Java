package com.tns.Abstract;

abstract class Calculate{
	public abstract String Shape();
	public abstract String Color();
	public abstract int Area();
	public abstract String toString();
}

class Rectangle1 extends Calculate{
	String shape;
	String color;
    int area1,width,length;
    
	
	public String  Shape(String shape) {return "Area of "+shape;}
	public String  Area(int area1,int width,int length){
		return "is "+(area1=width*length);
		}
	public String Color(String color) {return "and color is "+color;}
	
	public String toString()
    {
        return Shape();
//        return Shape();
//        return Shape();
    }
}

public class AbstractDemo2 {

	public static void main(String[] args) {
		Calculate obj=new Rectangle1("Rectangle", "Blue", 20, 20);
		obj.toString();

	}

}
