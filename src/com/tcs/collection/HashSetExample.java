package com.tcs.collection;

import java.util.HashSet;
import java.util.Iterator;
/**
 * 
 *Hash set Doesn't maintain insertion order.
 *HashSet class is non synchronized.
 *HashSet contains unique elements only.
 *HashSet allows null value.
 *HashSet uses a hash table for storage.
 *The initial default capacity of HashSet is 16, and the load factor is 0.75.
 *By default HashsSet constructor calls HashMap constructor. 
 *
 *0.75*16 =12 that means after 12th entry automatically it increase the size from 16 to 32. 
 */
public class HashSetExample {
	public static void main(String[] args) {
		HashSet<String> hashSet=new HashSet<>();
//		add method
		hashSet.add("Pavan Kalyan");
		hashSet.add("Vivek.A");
		hashSet.add("Vivek.K");
		hashSet.add("Vikas");
		hashSet.add("Pavithra");
		hashSet.add("Chandana");
		hashSet.add("Shyam");
		hashSet.add(null);
		hashSet.add(null);
		System.out.println(hashSet);
		
		boolean isContain=hashSet.contains("Pavan Kalyan");//contain method
		System.out.println(isContain);
		
		System.out.println(hashSet.isEmpty());//isEmpty
		
		System.out.println(hashSet.remove(null));//remove
		System.out.println(hashSet);
		
		System.out.println(hashSet.size());//size
		
		Iterator<String> iteratorHashSet=hashSet.iterator();
		
		System.out.println("Iterating each value from Hashset: -");
		while(iteratorHashSet.hasNext()) {
			System.out.println(iteratorHashSet.next());
		}
		
	}
}
