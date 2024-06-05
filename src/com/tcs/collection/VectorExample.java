package com.tcs.collection;

import java.util.Vector;
/**
 * 
 *Vector is like the dynamic array which can grow or shrink its size.
 *It is a part of Java Collection framework since Java 1.2
 *Vector implements the List interface
 *It is recommended to use the Vector class in the thread-safe implementation only.
 */
public class VectorExample {
	public static void main(String[] args) {
		Vector<String> vector=new Vector<>();
		vector.add("Pavan kalyan");
		vector.add("Vivek.A");
		vector.add("vivek.K");
		vector.add("Shyam Adapa");
		vector.add("pavithra");
		vector.add("Chandana");
		System.out.println(vector);
		vector.addElement("Rohit Sharma");
		System.out.println(vector);
		vector.remove(3);
		vector.removeElement("Pavan kalyan");
		System.out.println(vector);
		vector.add(0, "Pavan Kalyan");
		System.out.println(vector);
		System.out.println(vector.lastElement());
		System.out.println(vector.firstElement());
	}
}
