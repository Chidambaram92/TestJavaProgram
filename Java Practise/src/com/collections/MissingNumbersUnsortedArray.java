package com.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class MissingNumbersUnsortedArray 
{
	public static void main(String[] args) {
		//Unsorted Array input
		Integer[]inputArray= {10,9,6,7,7,9,10,3,4,3,5,1,2};
		
		// Convert input array to array list
		List arrList= Arrays.asList(inputArray);
		
		// Remove the duplicates by passing list to Hash set
		HashSet<Integer>hshObj= new HashSet(arrList);

		// Calculate the size
		int n= hshObj.size()+1;
		int sumOfNumbers=sumOfAllNNumbers(n);
		int sumHashNumbers=sumOfHashSetNumbers(hshObj);
		System.out.println("Missing Number in Array is : " +(sumOfNumbers-sumHashNumbers));
	}
	public static int sumOfAllNNumbers(int n){
		int sum= (n*(n+1))/2;
		return sum;
	}
	public static int sumOfHashSetNumbers(HashSet<Integer> hsobj){
		int sumOfHash=0;
		for(int objOne:hsobj) {
			sumOfHash=sumOfHash+objOne;
		}
		return sumOfHash;
	}
}
