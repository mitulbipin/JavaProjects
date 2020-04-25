package FirstPackage;

import java.util.Scanner;
import java.util.Stack;

public class Stacks{
	 static Scanner s=new Scanner(System.in);

	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		Stack<Integer> stack = new Stack<Integer>();
		stackPushAndPop(stack);
//		stack_pop(stack);
//		stack_search(stack);
	}
	
	public static void stackPushAndPop(Stack<Integer> stack) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter stack size:");
		int size=s.nextInt();
		for(int i=0;i<size;i++){
			System.out.println("Enter stack elements:");
			int stack_element = s.nextInt();
			stack.push(stack_element);
		}
//		System.out.println("Here: "+stack);
		System.out.println("Choose an option: \n 1:Pop\n 2:Search\n 3:Stack details");int option=s.nextInt();
			switch(option) {
			case 1:stack_pop(stack);break;
			case 2:stack_search(stack);break;
			case 4:System.out.println("Stack elements are: "+stack);
			default: System.out.println("Stack output is: "+stack);
			}

		}
	
	public static void stack_pop(Stack<Integer> stack){
		stack.pop();
		System.out.println("Pop successful. Stack elements are "+stack);
	}
	public static void stack_search(Stack<Integer> stack) {

		int key_element;
		System.out.println("Enter the element to be searched:");
		key_element = s.nextInt();
		int pos = stack.search(key_element);
		try {
			System.out.println("Element " +key_element+ " found at position:" +pos);
		}
		catch(Exception e) {
			System.out.println("Element not found");
		}
	}
	public static void stack_details(Stack<Integer> stack){
		
	}
		
}
