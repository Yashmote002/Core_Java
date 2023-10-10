package com.tns.Arrays;
//Code for JaggedArray 
//A jagged array is an array of arrays such that member arrays can be of different sizes
//, i.e., we can create a 2-D array but with a variable number of columns in each row.

public class ArrayEx9 {

	public static void main(String[] args) {
		int [][]JaggedArray= {
				{1,2,3,4}, 	//First row with four columns.
				{1,3,6}, //row with three columns.
				{4,7}  //row with two columns.
		};
		System.out.println("The values in JaggedArray is: ");
		for(int i=0;i<JaggedArray.length;i++) {
			for(int j=0;j<JaggedArray[i].length;j++) {
				System.out.print(JaggedArray[i][j]);
			}
			System.out.println("\n");
		}

	}

}
