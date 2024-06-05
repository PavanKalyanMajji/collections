package com.tcs.collection;


import java.util.Stack;
/**
 *The stack is a linear data structure that is used to store the collection of objects
 *Stack is based on Last-In-First-Out (LIFO).
 *The push operation inserts an element into the stack at last.
 *pop operation removes an element from the Top of the stack
 */
public class StackExample {
	public static void main(String[] args) {
		Stack<String> stack=new Stack<>();
		stack.add("Pawan Kalyan");
		stack.add("Adapa Shyam");
		stack.add("vivek.A");
		stack.add("vivek.k");
		stack.add("vikas");
		stack.add("Pavithra");
		stack.add("Chandana");
		stack.add("Virat Kohli");
		System.out.println(stack.pop());//pop will get last element and removes from the stack.
		stack.push("Rohit Sharma");//push method is used to push element at last in stack.
		System.out.println(stack);
	}
}
