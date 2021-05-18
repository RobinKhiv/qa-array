package com.qa.main;

public class Main {

	public static void main(String[] args) {
		
		int SIZE = 10;
		int[] myInts = { 1,2,3,4,5,6,7,8,9,10 };
		int[] myInts2 = new int[SIZE];
		int[] myInt3 = { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20 };
		String[] myStrings = {"one","two","three","four","five","six","seven","eight","nine","ten"};
		
		//Create an array that will hold 10 integer values, populate the array with values, then call and output each element.
		System.out.println("Array Value: " + myInts[0]);
		System.out.println("Array Value: " + myInts[1]);
		System.out.println("Array Value: " + myInts[2]);
		System.out.println("Array Value: " + myInts[3]);
		System.out.println("Array Value: " + myInts[4]);
		System.out.println("Array Value: " + myInts[5]);
		System.out.println("Array Value: " + myInts[6]);
		System.out.println("Array Value: " + myInts[7]);
		System.out.println("Array Value: " + myInts[8]);
		System.out.println("Array Value: " + myInts[9]);
	
		// Create a for loop that populates an integer array with values, outputting them at each iteration.
		for(int i = 0; i < SIZE; i++) {
			myInts2[i] = i;
			System.out.println("Current Array Index: " + myInts2[i]);
		}
		
		//Create an array of strings and iterate through it, printing each value to console, using an enhanced for loop.
		for (String value: myStrings) {
			System.out.println("String Value: "+ value);
		}
		
		//Create an array of integers 1-20 and iterate through it, using an enhanced for loop, square, and then print each value.
		for(int i: myInt3) {
			i = i*i;
			System.out.println("Squared Value: " + i);
		}
		
		//Using the array of integers from exercise above and the method created in exercise 3; 
		//iterate through the array using an enhanced for loop, calling the method from exercise 3 in the body.
		//	If the value is even, cube it, then print it to console.
		//	If the value is odd, square it, then print it to console.
		for(int i: myInt3) {
			if(Array.checkForEven(i)){
				System.out.print("Original Value: " + i);
				i = i*i*i;
				System.out.println(", New Value: " + i);
			}
			else {
				System.out.print("Original Value: " + i);
				i = i*i;
				System.out.println(", New Value: " + i);
			}
		}
	}

}
