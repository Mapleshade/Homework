package ru.kpfu.itis.group11506.stack;

import java.util.Iterator;

public class LinkedStack<T> implements Stack<T> {

	Node<T> startStack;
	int size;

	public LinkedStack() {
		this.startStack = null;
		this.size = 0;
	}
	
	public boolean empty() {
		if (startStack == null) {
			return true;
		}
		return false;
	}
	public void returnToStartNode() {
		while (startStack.getPreviousNode() != null) {
			startStack = startStack.getPreviousNode();

		}
	}

	public void show() {
		System.out.print(startStack.getValue() + " ");

		while (startStack.getNextNode() != null) {
			System.out.print(startStack.getNextNode().getValue() + " ");
			startStack = startStack.getNextNode();
		}
	}

	@Override
	public Iterator<T> iterator() {
		return null;
	}

	@Override
	public void push(T element) {
		Node<T> newNode = new Node<T>(element);
		newNode.setPrevious(null);
		if (startStack == null) {
			this.startStack = newNode;
		} else {
			newNode.setNode(this.startStack);
			this.startStack.setPrevious(newNode);
			this.startStack = newNode;
		}

		this.size++;
	}

	@Override
	public T poll() {
		Node<T> newNode = startStack;
		while (startStack.getNextNode() != null) {
			newNode = newNode.getNextNode();
			startStack = startStack.getNextNode();
		}
		startStack = startStack.getPreviousNode();
		startStack.setNode(null);
		size--;
		return newNode.getValue();

	}

	@Override
	public T peek() {
		Node<T> startStack = this.startStack;
		Node<T> newNode = startStack;
		startStack = startStack.getNextNode();
		while (startStack != null) {
			newNode = newNode.getNextNode();
			startStack = startStack.getNextNode();

		}
		returnToStartNode();
		return newNode.getValue();
	}
}