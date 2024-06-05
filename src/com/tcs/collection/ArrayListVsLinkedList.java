package com.tcs.collection;

import java.util.ArrayList;
import java.util.LinkedList;
/**
 * 
 *ArrayList internally uses a dynamic array to store the elements. Vs LinkedList internally uses a doubly linked list to store the elements.
 *ArrayList is better for storing and accessing data. Vs LinkedList is better for manipulating data.
 *when an ArrayList is initialized, a default capacity of 10 is assigned to the ArrayList. Vs There is no case of default capacity in a LinkedList.
 *
 */
public class ArrayListVsLinkedList {
	public static void main(String[] args) {
		ArrayList<Integer> arrayList=new ArrayList<>();
		LinkedList<Integer> linkedList=new LinkedList<>();
		
		
		for(int i=0;i<10000;i++) {
			arrayList.add(i);
			linkedList.add(i);
		}
		long arrayListInsertionStartTime = System.nanoTime();
		arrayList.add(2500, 454545);
		long arrayListInsertionEndTime =System.nanoTime();
		
		System.out.println("ArrayList insertion time: "+(arrayListInsertionEndTime-arrayListInsertionStartTime));
		
		long linkedListInsertionStartTime = System.nanoTime();
		linkedList.add(2500, 454545);
		long linkedListInsertionEndTime =System.nanoTime();
		
		System.out.println("LinkedList insertion time: "+(linkedListInsertionEndTime-linkedListInsertionStartTime));
		
		long arrayListDeletionStartTime = System.nanoTime();
		arrayList.remove(2500);
		long arrayListDeletionEndTime =System.nanoTime();
		
		System.out.println("LinkedList insertion time: "+(arrayListDeletionEndTime-arrayListDeletionStartTime));
		
		long linkedListDeletionStartTime = System.nanoTime();
		linkedList.remove(2500);
		long linkedListDeletionEndTime =System.nanoTime();
		
		System.out.println("linkedList Deletion time: "+(linkedListDeletionEndTime-linkedListDeletionStartTime));
		
		long arrayListAccessStartTime = System.nanoTime();
		arrayList.get(2500);
		long arrayListAccessEndTime =System.nanoTime();
		
		System.out.println("LinkedList insertion time: "+(arrayListAccessEndTime-arrayListAccessStartTime));
		
		long linkedListaccessStartTime = System.nanoTime();
		linkedList.get(2500);
		long linkedListaccessEndTime =System.nanoTime();
		System.out.println("linkedlist access time: "+(linkedListaccessEndTime-linkedListaccessStartTime));
	}
}
