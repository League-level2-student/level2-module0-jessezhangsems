package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] array= {"one", "two", "three", "four", "five"};
		System.out.println(array[2]);
		//2. print the third element in the array
		
		//3. set the third element to a different value
		array[2]="a different value";
		//4. print the third element again
		System.out.println(array[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		//6. make an array of 50 integers
		int[] array1=new int[50];
		//7. use a for loop to make every value of the integer array a random number
		for (int i = 0; i < array1.length; i++) {
			
			array1[i]=new Random().nextInt(50);
			System.out.println(array1[i]);
		}
		//8. without printing the entire array, print only the smallest number in the array
		int a=array1[0];
		for (int i = 0; i < array1.length; i++) {
			
			if (array1[i]<a) {
				a=array1[i];
				
			}
		}
	System.out.println(a);
		//9 print the entire array to see if step 8 was correct
		
		//10. print the largest number in the array.
	for (int i = 0; i < array1.length; i++) {
		if (array1[i]>a) {
			a=array1[i];
		}
	}
	System.out.println(a);
	}
}
