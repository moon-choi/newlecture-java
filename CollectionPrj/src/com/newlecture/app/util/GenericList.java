package com.newlecture.app.util;

public class GenericList<T> { //Collection 프레임 워크를 구현해본 것. 

	private Object[] items;
	private int current;
	private int capacity;
	private int amount;
	
	public GenericList() {
		items = new Object[3];
		current = 0;
		capacity = 3;
		amount = 5;		
	}
	
	public int size() {

		return current;
	}

	public void add(T item) { //들어올때 타입.
		if(capacity <= current) {
			amount = 10;
			Object[] temp = new Object[capacity + amount];
			
			for(int i = 0; i < current; i++) {
				temp[i] = items[i];
			}
			
			items = temp;
			capacity += amount;
		}
		
		items[current++] = item;
	}

	public void clear() {
		current = 0;
	}

	public Object get(int index) {
		if(current <= index) {
			throw new IndexOutOfBoundsException();
		}

		return (T)items[index]; //나갈때 타입. 
	}

}
