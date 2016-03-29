package ru.kpfu.itis.group11506.stack;

public interface Stack<T> extends Iterable<T> {

	/**
	 * добавляет элемент;
	 * 
	 * @param element
	 */
	public void push(T element);

	/**
	 * возвращает верхний элемент, удаляя его;
	 * 
	 * @return
	 */
	public T poll();

	/**
	 * возвращает верхний элемент;
	 * 
	 * @return
	 */
	public T peek();
}
