package com.test.javasolutions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class PrintDuplicateNumber {
	static int arrayOne[]={42,33,6,6,8,9,10,10,10,12,12};
	public static void main(String args[]){
		PrintDuplicateNumber.sortArray(arrayOne);
	}
	public static void sortArray(int arraySort[]) {
		for(int i=0;i<arraySort.length;i++) {
			for(int j=i+1;j<arraySort.length;j++) {
				if(arraySort[i]>arraySort[j]) {
					int temp=arraySort[i];
					arraySort[i]=arraySort[j];
					arraySort[j]=temp;
				}
			}
		}
		//Displaying elements of array after sorting  
		System.out.println("Elements of array sorted in ascending order: ");    
		for (int i = 0; i < arraySort.length; i++) {     
			System.out.print(arraySort[i] + " ");    
		}  
		System.out.println();
		PrintDuplicateNumber.convertArray(arrayOne);

	}


	public static void convertArray(int arr[]) {
		Arrays.sort(arrayOne);
		System.out.printf("Other way of Sorting-Modified arr[] : %s", Arrays.toString(arrayOne)); 
		System.out.println();
		Map<Integer,Integer>hMap= new HashMap<Integer,Integer>();
		for(int intOne:arrayOne) 
		{
			if(hMap.containsKey(intOne)) 
			{
				hMap.put(intOne, hMap.get(intOne)+1);
			}
			else {
				hMap.put(intOne, 1);
			}
		}
		Set<Map.Entry<Integer,Integer>>entrySet=hMap.entrySet();
		System.out.println("List of duplicate entries are:");
		for(Map.Entry<Integer, Integer>stVal:entrySet) {
			if(stVal.getValue()>1) {
				System.out.printf("%s : %d %n", stVal.getKey(), stVal.getValue());
			}
		}
	}

}
