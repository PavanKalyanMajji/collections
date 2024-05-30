package com.tcs.collection;

import java.util.TreeSet;
/**
 *By Default elements in the TreeSet will sorted.
 *TreeSet Doesn't allows the null value.
 *TreeSet class is non synchronized
 */
public class TreeSetExample {
	public static void main(String[] args) {
		TreeSet<Integer> treeSetExample =new TreeSet<>();
		treeSetExample.add(13);
		treeSetExample.add(45);
		treeSetExample.add(10);
		treeSetExample.add(12);
		treeSetExample.add(1);
		
		System.out.println(treeSetExample);
	}
}
