package com.hashmap;
import java.util.*;
public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList <Integer> ll=new LinkedList<>();
		ll.add(3);
		ll.add(4);
		ll.add(5);
		ll.remove(0);   //index
		ll.set(0,12);
		System.out.print(ll);
		
	}

}