package com.learning.datastructutre.binarytree;

public class BinaryTree {

	Node root;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BinaryTree bt = new BinaryTree();
		bt.root = new Node(1);
		bt.root.left = new Node(2);
		bt.root.right = new Node(3);
		bt.root.left.left = new Node(4);
		bt.root.left.right = new Node(5);
		bt.root.left.right.left = new Node(6);
		bt.root.left.right.left.right = new Node(7);
		
		//              1
		//        2            3
		//  4          5
		//          6
		//            7

		System.out.println(bt.maxDepth(bt.root));

		System.out.println(bt.countNodes(bt.root));
		
		bt.preOrderTraversal(bt.root);
		System.out.println();
		bt.postOderTraversal(bt.root);
		System.out.println();
		bt.inOrderTraversal(bt.root);
		
		
	}

	private void inOrderTraversal(Node node) {
		// TODO Auto-generated method stub
		
		if(node == null)
			return;
		
		inOrderTraversal(node.left);
		
		System.out.print(node.data + " ");
		
		inOrderTraversal(node.right);
	}

	private void postOderTraversal(Node node) {
		// TODO Auto-generated method stub
		
		if(node == null)
		{
			return;
		}
		
		postOderTraversal(node.left);
		
		postOderTraversal(node.right);
		
		System.out.print(node.data + " ");
		
	}

	private void preOrderTraversal(Node node) {
		
		if(node == null)
			return;
	
		System.out.print(node.data + " ");
		
		preOrderTraversal(node.left);
		
		preOrderTraversal(node.right);
	
	}

	private int countNodes(Node node) {
		// TODO Auto-generated method stub

		if (node == null)
			return 0;
		else {
			int count = 0;
			count += (countNodes(node.left) + countNodes(node.right))+1;
			return count;
		}

	}

	private int maxDepth(Node node) {
		// TODO Auto-generated method stub
		if (node == null)
			return 0;
		else {
			int lefthight = maxDepth(node.left);
			int righthight = maxDepth(node.right);

			return Math.max(lefthight, righthight) + 1;
		}
	}
	
	

}
