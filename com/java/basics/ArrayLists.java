package com.java.basics;

import java.util.*;

public class ArrayLists {
	
	static Scanner input = new Scanner(System.in);
	
	public static void main(String args[]) {
		ArrayList<String> arr1 = new ArrayList<>();
		
		for(int i = 0 ; i < 5 ; i++) {
			System.out.println("Enter String: ");String val = input.next();
			arr1.add(val);
		}
		Collections.sort(arr1);
		
		System.out.println(arr1);
	
	}
}
