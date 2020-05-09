package FirstPackage;

import java.util.HashMap;
import java.util.Scanner;
import java.lang.String;

public class hashMaps {
	static Scanner input = new Scanner(System.in);
	
	public static void main(String args[]) {
	
	HashMap<String, Integer> details = new HashMap<>();
	System.out.print("Enter the number of elements:");int hashMapCount = input.nextInt();	
	
	for(int i = 0; i <hashMapCount; i++ ) {
		
		System.out.print("\nEnter Name:");
			String name = input.next();
				char ch1 = name.charAt(0);
			boolean isUpper = Character.isUpperCase(ch1);
				name = isUpper? name : name.substring(0,1).toUpperCase() + name.substring(1);
				
		System.out.print("\nEnter Age:");
			int age = input.nextInt();
			
		details.put(name, age);
	}
	for(String i : details.keySet()) 
		System.out.print("\nName:" +i+ " Age:" +details.get(i));//get method is used to fetch the 'value'
	
	System.out.print("\nHash Details");
	System.out.print("\nHash size: " +details.size());
	System.out.println("\nEnter key element to be searched: ");String keyElement = input.next();
		boolean keyPresence = (details.containsKey(keyElement)) ? true :  false;
			
	}	
}
