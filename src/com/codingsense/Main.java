package com.codingsense;

public class Main {
	public static void main(String[] args) {
		SLL sll = new SLL();
		sll.insert(3);
		sll.insert(4);
		sll.insert(5);
		sll.insert(6);
		
		sll.delete(3);
		
		System.out.println(sll.size());
		sll.printList();
	}
}
