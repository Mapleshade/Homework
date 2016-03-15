package ru.kpfu.itis.group11506.links;

import java.util.Iterator;

public class LinkedList<T> {

	private Node<T> head;
	private Node<T> tail;
	private int size;

	public Node<T> getHead() {
		return head;
	}

	public Node<T> getTail() {
		return tail;
	}

	public void init() {
		head = tail = null;
		size = 0;
	}

	public int size() {
		return size;
	}

	private Node<T> moveToElement(int index) {
		int i = 0;
		Node<T> target = head;
		while (i < index) {
			target = target.next;
			i++;
		}
		return target;
	}

	// При добавлении нового элемента, который уже имеется в списке, образуется
	// цикл
	public boolean add(T value) {
		if (value == null)
			return false;
		Node<T> newNode = new Node<>(value);
		if (head == null) {
			head = newNode;
			tail = newNode;
			head.next = tail;
			size++;
			return true;
		} else {
			tail.next = newNode;
			tail = newNode;
			return true;
		}
	}

	public T removeLast() {
		T removedValue = tail.value;
		Node<T> current = moveToElement(size - 2);
		current.next = null;
		tail = current;
		return removedValue;
	}

	public Iterator<T> iterator() {
		return new Itr(head);
	}

	public CycleDetector<LinkedList<T>> detector() {
		return new LinkedListCD(this);
	}

	private class Node<E> {

		Node<E> next;
		E value;

		Node(E value) {
			this.value = value;
			next = null;
		}

		Node(Node<E> next, E value) {
			this.next = next;
			this.value = value;
		}

		Node<E> copy() {
			return new Node<>(next, value);
		}
	}

	private class Itr implements Iterator<T> {

		Node<T> root;
		Node<T> next;

		Itr(Node<T> root) {
			this.root = root;
			next = root;
		}

		@Override
		public boolean hasNext() {
			return next.next != null;
		}

		@Override
		public T next() {
			if (hasNext()) {
				Node<T> current = next;
				next = next.next;
				return current.value;
			} else
				return null;
		}

		public void reset() {
			next = root;
		}
	}

	private class LinkedListCD extends CycleDetector<LinkedList<T>> {

		LinkedListCD(LinkedList<T> list) {
			super(list);
		}

		@Override
		public void update(LinkedList<T> newList) {
			dataStructure = newList;
			hasBeenAnalyzed = false;
		}

		@Override
		public boolean containsAnyCycle() {
			if (hasBeenAnalyzed)
				return contains;
			Iterator<T> iterator = dataStructure.iterator();
			if (iterator.hasNext()) {
				T previousValue = iterator.next();
				while (iterator.hasNext()) {
					if (previousValue.equals(iterator.next())) {
						contains = true;
						cyclesCount++;
					}
				}
			}
			hasBeenAnalyzed = true;
			return contains;
		}

		@Override
		public int howManyCycles() {
			if (!hasBeenAnalyzed)
				containsAnyCycle();
			return cyclesCount;
		}
	}
}