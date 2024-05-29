package com.tcs.collection;

import java.util.*;
/**
 * 
 * Array List Maintains the insertion order.
 * by default the size of Array list is 10.
 * Array list is Not thread Safe.  
 *
 */
public class ArrayListExample {
	public static void main(String[] args) {
		Collection<String> listOfNumbers=new ArrayList<>();
		
		listOfNumbers.add("Pavan Kalyan");
		listOfNumbers.add(null);
		listOfNumbers.add("Pavan Kalyan");
		listOfNumbers.add("Nikhil");
				
		System.out.println("List of Numbers: -\n"+listOfNumbers+"\n");
		
		List<String> listOfNums=new ArrayList<String>();
		listOfNums.add("pavan Kalyan");
		listOfNums.add("Nikhil");
		listOfNums.add(null);
		
		System.out.println("value at index 0: -\n"+listOfNums.get(0)+"\n");//get method 
		
		System.out.println("Is their matching pattern: -\n"+listOfNums.contains("Pavan kalyan")+"\n");//contains
		
		listOfNums.add(2, "pavan");//add value at certain index
		System.out.println("List of values after adding the value at certain index: -\n"+listOfNums+"\n");
		
		listOfNums.addAll(listOfNumbers);//add all
		System.out.println("after adding another list: -\n"+listOfNums+"\n");
		
		System.out.println("is their all other list of values:- \n"+listOfNums.containsAll(listOfNumbers)+"\n");//containsAll
		
//		Note:- remove all values which are matched from other list of values.
		listOfNums.removeAll(listOfNumbers);//remove all 
		System.out.println("after Removing all the values from Other list: -\n"+listOfNums+"\n");
		
		listOfNums.addAll(0, listOfNumbers);//add all at certain index.
		System.out.println("added list of numbers at 0 index: -\n"+listOfNums+"\n");
		
		System.out.println("Iterrating each value by using for each: -");
		for(String obj : listOfNums) {
			System.out.println(obj);
		}
		
		System.out.println("\n"+"Iterrating each value by using for each method: -");
		listOfNums.forEach(value -> System.out.println(value));//using lambda expression.
		
		System.out.println("\n"+"Iterrating each value by using for each method: -");
		listOfNums.forEach(System.out::println);//by using method references.
		System.out.println();
		
		listOfNums.clear();//clear
		System.out.println("list of values after clear: -\n"+listOfNums);
	}
}
