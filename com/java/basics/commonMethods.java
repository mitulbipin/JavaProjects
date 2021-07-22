package com.java.basics;

//import FirstPackage.linkedLists.MyNode;

public class commonMethods {
	
	public static String convertToUpperCase(String element) {
		char ch1 = element.charAt(0);
	boolean isUpper = Character.isUpperCase(ch1);
		element = isUpper? element : element.substring(0,1).toUpperCase() + element.substring(1);
		
		return element;
	}
}
class MyNode{
    String data;MyNode link;
    public MyNode(String data){this.data = data;this.link = null;}
}
class BinarySearchNode{
	int key;
	BinarySearchNode left,right;
	public BinarySearchNode(int key) {
		this.key = key; 
		left = null;right = null;
	}
}