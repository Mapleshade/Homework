package ru.kpfu.itis.group11506.queueExample;

import java.util.NoSuchElementException;

public class RealizePriortyQueue<T> implements PriorityQueue<T> {

	private Object[] elements;
	private int size = 0;
	private int index = 0;
	private final int defaultSize = 15;

	public RealizePriortyQueue() {
		this.elements = new Object[defaultSize];
	}

	public RealizePriortyQueue(int size) {
		this.elements = new Object[size];
		// this.size = size;
	}

	public int length() {
		return this.size;
	}

	public void growArray() {
		Object[] newOne = new Object[elements.length * 2];

		for (int i = 0; i < elements.length; i++) {
			newOne[i] = elements[i];
		}
		this.elements = newOne;
	}

	@Override
	public void push(T element) /* throws QueueOutOfBoundException */ {
		// TODO Auto-generated method stub

		if (index == elements.length) {
			growArray();
		}
		elements[index] = element;
		this.index++;
		this.size++;
	}

	public Object get(int index) throws QueueOutOfBoundException {
		return elements[index];
	}

	@Override
	public Object poll() throws NoSuchElementException {
		// TODO Auto-generated method stub
		Object firstElement = elements[0];
		for (int i = 0; i < elements.length - 1; i++) {
			elements[i] = elements[i + 1];
		}
		size--;
		return firstElement;
	}
	
	public Object[] getArray() {
		return elements;
	}
	@Override
	public Object peek() throws NoSuchElementException {
		// TODO Auto-generated method stub
		return elements[0];
	}

}
