package com.codingsense;

import java.util.Iterator;

public class Main {
	public static void main(String[] args) {
//		SLL sll = new SLL();
//		sll.insert(3);
//		sll.insert(4);
//		sll.insert(5);
//		sll.insert(6);
//		
//		sll.insertAtPosition(7, 4);
//		sll.delete(3);
//		
//		System.out.println("index: " + sll.indexOf(11));
//		
//		System.out.println(sll.size());
//		sll.printList();
		
//		DLL dll = new DLL();
//		dll.insert(3);
//		dll.insert(4);
//		dll.insert(5);
//		dll.insert(6);
		
//		dll.insertAtPosition(7, 4);
//		dll.delete(3);
		
//		System.out.println("index: " + dll.indexOf(11));
//		
//		System.out.println(dll.size());
//		dll.traverseForward();
//		System.out.println();
//		dll.traverseBackward();
		
		Stack<Integer> stack = new Stack<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		
		Iterator<Integer> iterator = stack.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
