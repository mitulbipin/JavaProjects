package FirstPackage;

import java.util.LinkedList;
import java.util.Scanner;
@SuppressWarnings("static-access")
public class linkedLists {
	static Scanner input = new Scanner(System.in);
	
    public static MyNode head;
    public static MyNode tail;
    
	public static void main(String args[]) {
		
//Linked List 1 Logic
		
		LinkedList<String> linkList1 = new LinkedList<>();
		System.out.println("Enter the number of elements for Linked List 1: ");
			int elementCount = input.nextInt();
			
			for(int i=1;i<=elementCount;i++) {
				System.out.print("\nEnter the element: ");
					String element = input.next();
				System.out.print("\nNumber of elements that can be added: " +(elementCount-i));
					linkList1.add(element);
			}
			System.out.print("\nLinked List 1: " +linkList1);
//Linked List 2 Logic 
			linkedLists linkList2 = new linkedLists();
			System.out.println("\nEnter the number of elements for Linked List 2: ");
			int elementCount2 = input.nextInt();
			
			for(int i=0;i<elementCount2;i++) {
			String element2 = input.next();
			linkList2.insert(element2);
			}
			linkList2.printList();
	}

    public void insert(String data) {
		// TODO Auto-generated method stub
    	MyNode new_node = new MyNode(data);

    	if(head == null) {
    		head = new_node;
    		tail = new_node;
    	}
    	else {
    		tail.link = new_node;
    		tail = new_node;
    	}
    }
    @SuppressWarnings("null")
	public static void printList() {
    	MyNode currentNode = head;
    	if(head == null)
    		System.out.println("\nList is empty");
    	 
    	while(currentNode != null) {
    		System.out.println("Linked List 2: "+currentNode.data + " ");
    		currentNode = currentNode.link;
    		}
    	System.out.println();   
    }
    
}
