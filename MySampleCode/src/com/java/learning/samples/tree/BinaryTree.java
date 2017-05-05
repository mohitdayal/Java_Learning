package com.java.learning.samples.tree;

import com.java.learning.BNode;

public class BinaryTree {

	public static void main(String[] args) {

		int[] data = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		BNode<Integer> root = createBinaryTree(data);
		inOrderPrint(root);
		
	}

	
	
	private static void inOrderPrint(BNode<Integer> root) {

		
	}



	private static BNode<Integer> createBinaryTree(int[] data) {

		BNode<Integer> root = new BNode<Integer>();
		root.setData(data[0]);
		BNode<Integer> current = root;
		for (int i = 1; i < data.length; i++) {
			BNode<Integer> temp = root;
			while (current != null) {
				temp = current;
				if (current.getData() < data[i]) {
					current = current.getRight();

				} else {
					current = current.getLeft();
				}
			}
			BNode<Integer> bNode = new BNode<Integer>();
			bNode.setData(data[i]);
			bNode.setParent(temp);
			if (temp.getData() < data[i]) {
				temp.setRight(bNode);
			} else {
				temp.setLeft(bNode);
			}
			
		}
		return root;
	}

}
