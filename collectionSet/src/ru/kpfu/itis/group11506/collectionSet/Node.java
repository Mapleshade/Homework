package ru.kpfu.itis.group11506.collectionSet;

public class Node<K, V> {

	private K key;
	private V value;
	private Node<K, V> nextNode;

	public void setNode(Node<K, V> nextNode) {
		this.nextNode = nextNode;
	}

	Node(K key, V value) {
		this.key = key;
		this.value = value;
	}

	public Node<K, V> getNextNode() {
		return nextNode;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}

	K getKey() {
		return key;
	}
}