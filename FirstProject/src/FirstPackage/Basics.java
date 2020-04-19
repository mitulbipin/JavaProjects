package FirstPackage;

import java.util.Scanner;

public class Basics {
	
	public static void main(String args[]){
		math_Functions();
	}
	static void math_Functions() {
		int a;
		System.out.println("Input variable:");
		a = new Scanner(System.in).nextInt(); 	
		System.out.println((int)Math.sqrt(a));//Square root
	}
}	
