package FirstPackage;

import java.util.LinkedList;
import java.util.Scanner;

public class linkedList {
	static Scanner input = new Scanner(System.in);

	public static class Node{
		int data;
		Node next;
	}
	
	public static void main(String args[]) {
		
		LinkedList<String> linkList1 = new LinkedList<>();
		System.out.println("Enter the number of elements: ");
			int elementCount = input.nextInt();
			
			for(int i=1;i<=elementCount;i++) {
				System.out.print("Enter the element: ");
				System.out.print("\nNumber of elements that can be added" +(elementCount-i));
					String element = input.next();
				linkList1.add(element);
			}
			System.out.print(linkList1);
			
//		linkedListWithoutCollectionClasses(elementCount);
	}

//	private static void linkedListWithoutCollectionClasses(int elementCount) {
//
//		System.out.println("\nLinked List without collection class");
//		// TODO Auto-generated method stub
//		Node[] node = new Node[5];
//			
//		for(int i=1;i<=elementCount;i++) { //Taking user input to insert elements in Linked List. 
//			System.out.print("Enter the element: ");
//				int element = input.nextInt();
//				node[i].data = element;
//				if(i==elementCount)
//					node[i].next=null;
//				else
//					node[i].next=node[i+1];
//				
//		}	
//		for(int i=1;i<=elementCount;i++) {
//			System.out.print(node[i].data+" ");
//			node[i]=node[i].next;
//			}
//	}
}
