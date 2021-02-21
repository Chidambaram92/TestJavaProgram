package com.test.javasolutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;



public class IterateMapClass {

	public static void main(String[] args) {
		IterateMapClass objMap= new IterateMapClass();
		objMap.iterateOverMap();
		objMap.arrayListDuplicate();
	}
	private void iterateOverMap() {
		HashMap<Integer,String>hOne= new HashMap<Integer,String>();
		hOne.put(1, "Amar");
		hOne.put(2, "Morris");
		hOne.put(3, "Venis");
		hOne.put(4, "Revb");
		hOne.put(null, "Test");
		hOne.put(5, "Max");	
		hOne.put(6, null);	
		hOne.put(7, "Ace");	
		hOne.put(5, null);
		hOne.put(7, "Star");	
		Set<Map.Entry<Integer,String>> entrySet = hOne.entrySet();
		for(Map.Entry<Integer,String>entries:entrySet) {
			System.out.println("Key is : "+entries.getKey()+ " Value is: "+entries.getValue());
		}
		System.out.println(hOne.get(3));
	}
	private void arrayListDuplicate() {
		List<Integer>arrList= new ArrayList<Integer>(Arrays.asList(1,5,7,9,10,15,15,7,23,23));
		System.out.println("Array List with duplicates: "+arrList);
		HashSet<Integer>hashSt= new LinkedHashSet<Integer>(arrList);
		List<Integer>noDuplicate= new ArrayList<Integer>(hashSt);
		System.out.println("Array List without duplicates: "+noDuplicate);
	}
}

}
