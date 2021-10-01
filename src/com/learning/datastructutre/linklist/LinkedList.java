package com.learning.datastructutre.linklist;

import java.util.HashSet;

public class LinkedList {

	Node head;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList ll = new LinkedList();
		ll.head = new Node(10);
		ll.head.next = new Node(30);
		ll.head.next.next = new Node(30);
		ll.head.next.next.next = new Node(40);
		ll.head.next.next.next.next = new Node(40);

		// System.out.println(printMiddle(ll.head));

		printLinkedList(ll.head);
		System.out.println();

		// printLinkedList(reverseLinkedList(ll.head));

		removeDuplicate(ll.head);

		printLinkedList(ll.head);

	}

	private static void removeDuplicate(Node head) {
		// TODO Auto-generated method stub

		HashSet<Integer> data = new HashSet<Integer>();

		Node curr = head;
		Node prev = null;

		while (curr != null) {

			if (data.add(curr.data)) {
				prev = curr;
			} else {
				prev.next = curr.next;
			}
			curr = curr.next;
		}

	}

	private static int printMiddle(Node head) {

		Node slowPointer = head;
		Node fastPointer = head;
		if (head != null) {
			while (fastPointer != null && fastPointer.next != null) {
				fastPointer = fastPointer.next.next;
				slowPointer = slowPointer.next;

			}

			return slowPointer.data;
		}
		return 0;
	}

	private static Node reverseLinkedList(Node head) {
		// TODO Auto-generated method stub

		Node prev = null;
		Node curr = head;
		Node next = null;

		while (curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;

		}

		head = prev;
		return head;

	}

	private static void printLinkedList(Node head) {

		while (head != null) {
			System.out.print(head.data + "->");
			head = head.next;
		}
	}

}
