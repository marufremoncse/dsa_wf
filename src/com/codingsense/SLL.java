package com.codingsense;

class Node<T> {
	T data;
	Node next;

	public Node() {
		this.data = null;
		this.next = null;
	}

	Node(T data) {
		this.data = data;
		this.next = null;
	}
}

@SuppressWarnings("unchecked")
public class SLL<T> {
	Node head;
	int size;

	SLL() {
		head = null;
		size = 0;
	}

	void insert(T t) {
		Node node = new Node(t);
		
		if(head==null) {
			head = node;
		} else {
			Node temp = head;
			
			while(temp!=null && temp.next!=null) {
				temp = temp.next;
			}
			temp.next = node;
		}
		size++;
	}

	void insertAtBeggining() {

	}

	void insertAtEnd() {

	}

	void insertAtPosition(T data, int index) {
		if(index<0 || index>size) {
			System.out.println("Invalid index");
			return;
		}
		Node node = new Node(data);
		if(index==0) {
			node.next = head;
			head = node;
			size++;
			return;
		}
		Node temp = head;
		while(--index>0) {
			temp = temp.next;
		}
		node.next = temp.next;
		temp.next = node;
		size++;
	}

	void delete(T data) {
		if(head==null) {
			return;
		} else if(head.data.equals(data)) {
			head=head.next;
			return;
		}
		Node temp1 = head;
		Node temp2 = head.next;
		
		while(temp2!=null) {
			if(temp2.data.equals(data)) {
				temp1.next = temp2.next;
				size--;
				return;
			}
			temp1 = temp1.next;
			temp2 = temp2.next;
		}
	}

	void deleteAtBeginning() {

	}

	void deleteAtEnd() {

	}

	void deleteAtPosition(int index) {

	}

	boolean contains(T data) {
		return false;
	}

	int indexOf(T data) {
		int index = -1;
		if(head==null) {
			return index;
		}
		Node temp = head;
		while(temp!=null) {
			++index;
			if(temp.data.equals(data)) {
				return index;
			}
			temp = temp.next;
		}
		
		return -1;
	}

	Node get(int index) {
		return null;
	}

	void printList() {
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}

	int size() {
		return size;
	}
	
}
