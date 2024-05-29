package com.tcs.collection;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
/**
 * 
 *Linked List maintains the insertion order.
 *initial capacity of linked list is zero.
 *elements can't be sort by default.
 *
 */
public class LinkedListExample {
	public static void main(String[] args) {
		
		List<Integer> listOfNums=new LinkedList<>();
		listOfNums.add(10);
		listOfNums.add(5);
		listOfNums.add(10);
		
		List<Integer> listOfNumbers=new LinkedList<>();
		listOfNumbers.add(10);
		listOfNumbers.add(5);
		listOfNumbers.add(8);
		listOfNumbers.add(10);
		listOfNumbers.add(8);
//		listOfNumbers.add(null);
//		listOfNumbers.add(null);
	
		listOfNumbers.add(1, 66);//add element at certain index.
		
		listOfNumbers.addAll(listOfNums);//add all
		System.out.println("lastIndex of 8: -\n"+listOfNumbers.lastIndexOf(8));//last index of
		
		System.out.println(listOfNumbers);
	
		for(Integer obj : listOfNumbers) {
			System.out.println(obj);
		}
		
//		Sorting the linked list by using sort method from collections class
		Collections.sort(listOfNumbers);
		
		LinkedList<Integer> linkedList=new LinkedList<>();
		linkedList.add(15);
		linkedList.add(5);
		linkedList.add(20);
		linkedList.add(1);
		linkedList.add(45);
		System.out.println("linked list: - "+linkedList);
		System.out.println(linkedList.peek());//Peek method retrieves but does not remove, the head
		System.out.println("linked list after peek: - "+linkedList);
		System.out.println(linkedList.poll());//This method retrieves and removes the head.
		System.out.println("linked list after poll: - "+linkedList);
		System.out.println(linkedList.pop());//This method Pops an element from the stack represented by this list.
		System.out.println("linked list after pop: - "+linkedList);
	}
}
