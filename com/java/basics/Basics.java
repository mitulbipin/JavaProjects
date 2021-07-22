package com.java.basics;

import java.util.Scanner;

public class Basics {
	public void operation_Performed(int option) {
		switch(option){
		case 1:System.out.println("Mathemtical functions");math_Functions();
				break;
		case 2:System.out.println("String manipulations");string_Manipulation();
				break;
		default:System.out.println("Invalid Option");break;
		}
	}
	public static void main(String args[]){
	Basics basic = new Basics();
	System.out.println("Please choose which operation needs to be performed:\r");int option =new Scanner(System.in).nextInt();
		basic.operation_Performed(option);
	}

	static void math_Functions() {
		//Square root
		System.out.println("Input variable:");
		int a = new Scanner(System.in).nextInt(); 	
		System.out.println((int)Math.sqrt(a));
	}
	
	static void string_Manipulation(){
		String str1,str2;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter string contents 1");str1 = s.next();
		System.out.println("Enter string contents 2");str2 = s.next();
		System.out.println("Combination of "+str1+ "&" +str2+ "is:" +str1.concat(str2));
		
	}
}	


