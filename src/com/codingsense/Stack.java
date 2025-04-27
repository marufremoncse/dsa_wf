package com.codingsense;

import java.util.Iterator;
import java.util.LinkedList;

public class Stack<T> implements Iterable<T>{
	LinkedList<T> list;	
	
	public Stack() {
		list = new LinkedList<T>();
	}
	
	T push(T t){
		list.addLast(t);
		return t;
	}
	
	void pop(){
		list.removeLast();
	}
	
	T peek(){
		return list.getLast();
	}
	
	boolean isEmpty(){
		return list.size()==0;
	}
	
	int size(){
		return list.size();
	}

	@Override
	public Iterator<T> iterator() {
		return
			new Iterator<T>() {
				int count = list.size();
				@Override
				public boolean hasNext() {
					return count > 0;
				}
				@Override
				public T next() {
					return list.get(--count);
				}
			};
	}
	
	
}
