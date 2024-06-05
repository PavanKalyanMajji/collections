package com.tcs.collection.map;

import java.util.HashMap;

public class HashMapExample {
	public static void main(String[] args) {
		HashMap<Integer, String> hashMap=new HashMap<>();
		hashMap.put(45, "RohitSharma");
		hashMap.put(18, "Virat Kohli");
		hashMap.put(63, "Surya Kumar Yadav");
		hashMap.put(null, "Mr.Pk45");
		hashMap.put(null, "Vivek Akundi");
		hashMap.put(17, "Rishab pant");
		
		System.out.println(hashMap);
		System.out.println(hashMap.get(null));
		System.out.println(hashMap.containsKey(45));
		hashMap.remove(null);
		System.out.println(hashMap);
		System.out.println(hashMap.containsValue("RohitSharma"));
		hashMap.replace(17, "ABD 360");
		System.out.println(hashMap);
	}
}
