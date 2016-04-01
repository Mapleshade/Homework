package ru.kpfu.itis.group11506.queueExample;

import java.util.NoSuchElementException;

public interface Queue<T> {

	void push(T element) throws QueueOutOfBoundException;

	Object poll() throws NoSuchElementException;

	Object peek() throws NoSuchElementException;

}
