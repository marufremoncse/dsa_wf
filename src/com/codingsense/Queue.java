package com.codingsense;

import java.util.Iterator;
import java.util.LinkedList;

public class Queue<T> implements Iterable<T>{
	LinkedList<T> list;	
	
	public Queue() {
		list = new LinkedList<T>();
	}
	
	T enqueue(T t){
		list.addLast(t);
		return t;
	}
	
	void dequeue(){
		list.removeFirst();
	}
	
	T peek(){
		return list.getFirst();
	}
	
	boolean isEmpty(){
		return list.size()==0;
	}
	
	int size(){
		return list.size();
	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return new Iterator<T>() {
			int count = 0;
			@Override
			public boolean hasNext() {
				return count < list.size();
			}

			@Override
			public T next() {
				return list.get(count++);
			}
		};
	}

	
	
}