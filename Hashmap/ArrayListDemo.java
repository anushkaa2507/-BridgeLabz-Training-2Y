package com.hashmap;
import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		
		ArrayList <Integer> al=new ArrayList<>();
		al.add(3);
		al.add(4);
		al.add(5);
		al.remove(0);   //index
		al.set(0,12);
		System.out.print(al);
		
	}

}