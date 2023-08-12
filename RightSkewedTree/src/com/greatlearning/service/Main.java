package com.greatlearning.service;

import com.greatlearning.assignment.Node;
import com.greatlearning.assignment.RightSkewedTree;

public class Main {

	// Driver Code
	public static void main(String[] args) {

		RightSkewedTree.node = new Node(50);
		RightSkewedTree.node.left = new Node(30);
		RightSkewedTree.node.right = new Node(60);
		RightSkewedTree.node.left.left = new Node(10);
		RightSkewedTree.node.left.right = new Node(40);
		RightSkewedTree.flattenBSTToRightSkewed(RightSkewedTree.node);
		RightSkewedTree.traverseRightSkewed(RightSkewedTree.headNode);
	}
}