package com.java.basics;

import java.util.HashMap;
import java.util.Scanner;

public class hashMaps {
	static Scanner input = new Scanner(System.in);
	
	public static void main(String args[]) {
	
	HashMap<String, Integer> details = new HashMap<>();
	System.out.print("Enter the number of elements:");int hashMapCount = input.nextInt();	
	
	for(int i = 0; i <hashMapCount; i++ ) {
		
		System.out.print("\nEnter Name:");
			String name = input.next();
			 name = commonMethods.convertToUpperCase(name);
				
		System.out.print("\nEnter Age:");
			int age = input.nextInt();
			
		details.put(name, age);
	}
	for(String i : details.keySet()) 
		System.out.print("\nName:" +i+ " Age:" +details.get(i));//get method is used to fetch the 'value'
	
	System.out.print("\nHash Details");
	
	System.out.print("\nHash size: " +details.size());
	
	System.out.println("\nEnter key element to be searched: ");
		String keyElement = input.next();
		keyElement = commonMethods.convertToUpperCase(keyElement);
		String keyPresence = (details.containsKey(keyElement)) ? "Present" : "Not Present";
			System.out.print(keyPresence);			
	}
}
