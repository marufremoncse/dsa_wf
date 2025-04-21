package com.codingsense;

class DLLNode<T> {
	T data;
	DLLNode prev;
	DLLNode next;

	public DLLNode() {
		this.data = null;
		this.prev = null;
		this.next = null;
	}

	DLLNode(T data) {
		this.data = data;
		this.prev = null;
		this.next = null;
	}
}

@SuppressWarnings("unchecked")
public class DLL<T> {
	DLLNode head;
	DLLNode tail;
	int size;

	DLL() {
		head = null;
		tail = null;
		size = 0;
	}

	void insert(T t) {
		DLLNode node = new DLLNode(t);
		
		if(head==null) {
			head = node;
			tail = node;
		} else {
			tail.next = node;
			tail = node;
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
		DLLNode node = new DLLNode(data);
		if(index==0) {
			node.next = head;
			head = node;
			size++;
			return;
		}
		DLLNode temp = head;
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
		DLLNode temp1 = head;
		DLLNode temp2 = head.next;
		
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
