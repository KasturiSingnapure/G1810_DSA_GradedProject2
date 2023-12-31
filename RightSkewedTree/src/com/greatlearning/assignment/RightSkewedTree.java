package com.greatlearning.assignment;

//binary search tree into a right skewed
//tree in increasing order

//Class to convert BST to binary skewed tree
public class RightSkewedTree {
	public static Node node;
	static Node prevNode = null;
	public static Node headNode = null;

	// Method to change BST To Right Skewed tree
	public static void flattenBSTToRightSkewed(Node root) {
		// Base Case
		if (root == null) {
			return;
		}
		flattenBSTToRightSkewed(root.left);
		Node rightNode = root.right;

		// Condition to check if the root Node
		// of the skewed tree is not defined
		if (headNode == null) {
			headNode = root;
			root.left = null;
			prevNode = root;
		} else {
			prevNode.right = root;
			root.left = null;
			prevNode = root;
		}
		flattenBSTToRightSkewed(rightNode);
	}

	// Function to traverse the right
	// skewed tree using recursion
	public static void traverseRightSkewed(Node root) {
		if (root == null) {
			return;
		}
		System.out.print(root.val + " ");
		traverseRightSkewed(root.right);
	}

	// Driver Code
	public static void main(String[] args) {
		// Data values are inserted for binary search tree
		RightSkewedTree.node = new Node(50);
		RightSkewedTree.node.left = new Node(30);
		RightSkewedTree.node.right = new Node(60);
		RightSkewedTree.node.left.left = new Node(10);
		RightSkewedTree.node.left.right = new Node(40);
		// call static method to change BST to right skewed tree
		flattenBSTToRightSkewed(node);
		// call static method to recursively traverse and print the values
		traverseRightSkewed(headNode);
	}
}