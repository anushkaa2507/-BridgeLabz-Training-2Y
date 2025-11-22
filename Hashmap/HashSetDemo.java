package com.hashmap;
import java.util.*;

public class HashSetDemo {
	public static void main(String[] args) {
		
		HashSet <Integer> hs=new HashSet<>();
		hs.add(3);
		hs.add(4);
		hs.add(5);
		hs.remove(3);  //value

		System.out.print(hs);
		
	}
}