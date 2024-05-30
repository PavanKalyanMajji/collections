package com.tcs.collection;

import java.util.LinkedHashSet;
/**
 * 
 *LinkedHashSet an ordered version of HashSet.
 *It Maintain's the insertion order of HashSet.
 *LinkedHashSet have null value.
 *it maintain's unique.
 *initial capacity is 16 and load factor is 0.75f
 *
 */
public class LinkedSetExample {
	public static void main(String[] args) {
		LinkedHashSet<Integer> setOfNumbers=new LinkedHashSet<Integer>();
		setOfNumbers.add(13);
		setOfNumbers.add(45);
		setOfNumbers.add(10);
		setOfNumbers.add(12);
		setOfNumbers.add(null);
		setOfNumbers.add(1);
		
		System.out.println(setOfNumbers);
		
		
	}
}
