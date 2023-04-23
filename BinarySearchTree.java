package com.glearning.dsalab3;

 class Node{
	int data;
	Node left;
	Node right;
	
	
	Node(int key){
		data = key;
		this.left = null;
		this.right = null;
		
	}
}
  public class BinarySearchTree {
	Node root;
	
	BinarySearchTree(){root = null;}
	void insert(int key) { root = insert(root, key); }
	
	Node insert(Node root, int data) {
		if(root == null) {
			root = new Node(data);
			return root;	
		}
		if(data < root.data) {
			root.left = insert(root.left, data);
		}
		else if(data > root.data) {
			root.right = insert(root.right, data);
		}
		return root;
		
	}
	boolean isPairPresent(Node root, Node temp, int target)
    {
        if (temp == null)
            return false;
 
        return search(root, temp, target - temp.data)
            || isPairPresent(root, temp.left, target)
            || isPairPresent(root, temp.right, target);
    }
 
    boolean search(Node root, Node temp, int k)
    {
 
        if (root == null)
            return false;
 
        Node c = root;
        boolean flag = false;
        while (c != null && flag != true) {
            if (c.data == k && temp != c) {
                flag = true;
                System.out.println("Pair Found: " + c.data
                                   + " + " + temp.data);
                return true;
            }
            else if (k < c.data)
                c = c.left;
            else
                c = c.right;
        }
 
        return false;
    }

 public static void main(String[] args) {
	 BinarySearchTree tree = new BinarySearchTree();
	 tree.insert(15);
	 tree.insert(10);
	 tree.insert(20);
	 tree.insert(8);
	 tree.insert(12);
	 tree.insert(16);
	 tree.insert(25);
	 
	 boolean test
     = tree.isPairPresent(tree.root, tree.root, 35);
	 boolean test1
     = tree.isPairPresent(tree.root, tree.root, 20);
	 if (!test)
     System.out.println("No such values are found!");
	 
 }
}