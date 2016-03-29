package ru.kpfu.itis.group11506.stack;

public class Node<T> {

	private Node<T> nextNode;
	private Node<T> previousNode;
	private T value;

	public Node(T value) {
		this.value = value;
		this.nextNode = null;
		this.previousNode = null;
	}

	public void setNode(Node<T> nextNode) {
		this.nextNode = nextNode;
	}

	public Node<T> getNextNode() {
		return nextNode;
	}

	public T getValue() {
		return value;
	}

	public Node<T> getPreviousNode() {
		return previousNode;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public void setPrevious(Node<T> previousNode) {
		this.previousNode = previousNode;

	}
}

