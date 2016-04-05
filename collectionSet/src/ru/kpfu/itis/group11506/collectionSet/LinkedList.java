package ru.kpfu.itis.group11506.collectionSet;

import java.util.Iterator;

public class LinkedList<T> {

	private Node head;
	private Node tail;
	private int size;

	public Node getHead() {
		return head;
	}

	public Node getTail() {
		return tail;
	}

	public void init() {
		head = tail = null;
		size = 0;
	}

	public int size() {
		return size;
	}

	private Node moveToElement(int index) {
		int i = 0;
		Node target = head;
		while (i < index) {
			target = target.getNextNode();
			i++;
		}
		return target;
	}

	// При добавлении нового элемента, который уже имеется в списке, образуется
	// цикл
	public boolean add(T value) {
		if (value == null)
			return false;
		Node newNode = null;
		if (head == null) {
			head = newNode;
			tail = newNode;
			head.setNode(tail);
			size++;
			return true;
		} else {
			tail.setNode(newNode);
			tail = newNode;
			return true;
		}
	}

	public T removeLast() {
		T removedValue = (T) tail.getValue();
		Node current = moveToElement(size - 2);
		current.setNode(null);
		tail = current;
		return removedValue;
	}

	public Iterator<T> iterator() {
		return new Itr<>(head);
	}
	

	private class Itr<E> implements Iterator<T> {

		Node root;
		Node next;

		Itr(Node root) {
			this.root = root;
			next = root;
		}

		@Override
		public boolean hasNext() {
			return next.getNextNode() != null;
		}

		@Override
		public T next() {
			if (hasNext()) {
				Node current = next;
				next = next.getNextNode();
				return (T) current.getKey();
			} else
				return null;
		}

		//public void reset() {
		//	next = root;
		//}
	}
}