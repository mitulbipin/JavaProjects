package FirstPackage;

import java.util.Scanner;

class BinarySearchTree {
	static Scanner input = new Scanner(System.in);
	BinarySearchNode root; 
	BinarySearchTree(){root = null;}//root initialization
	
	void insert(int key) {
		root = insertKey(root,key);
	}
	
	BinarySearchNode insertKey(BinarySearchNode root, int key) {
		
		if(root == null) {
			root = new BinarySearchNode(key);
			return root;
			}
		if(key < root.key)
			root.left = insertKey(root.left,key);
		else if(key > root.key)
			root.right = insertKey(root.right,key);
		
		return root;
	}

	void order() {
		orderTree(root);
	}

	public void orderTree(BinarySearchNode root) {
		if(root != null) {
			orderTree(root.left);
			System.out.println(root.key);
			orderTree(root.right);
		}
	}

	public static void main(String args[]) {
		BinarySearchTree tree = new BinarySearchTree();
		
	
			System.out.println("Enter tree element numbers: ");int number = input.nextInt();
			for(int i = 0 ; i < number ; i++) {
				System.out.print("\nEnter the value:");int value = input.nextInt();
				tree.insert(value);
			}
			
			tree.order();
		
	}
}
