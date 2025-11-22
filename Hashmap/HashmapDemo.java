package com.hashmap;
import java.util.HashMap;

public class HashmapDemo {

	public static void main(String[] args) {
		HashMap<Integer,Integer> hs=new HashMap<>();
		hs.put(4,5);
		hs.put(2,400);
		hs.put(3, 600);
		hs.remove(2,400);
		hs.replace(4,10 );
		System.out.print(hs);

	}

}