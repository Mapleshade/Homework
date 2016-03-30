package ru.kpfu.itis.group11506.stack;

public class Main {

	public static void main(String[] args) {

		// тест линкедСтэка;
		LinkedStack<Integer> linkedStack = new LinkedStack<>();

		linkedStack.push(1);
		linkedStack.push(2);
		linkedStack.push(3);

		linkedStack.show();
		System.out.println();

		System.out.println(linkedStack.peek() + "a");
		Integer example = linkedStack.poll();
		System.out.println(example + "b");
		System.out.println(linkedStack.peek() + "c");

		String exampleString = "1 + { 2 + 3} + (4 + 5)";
		Check check = new Check(exampleString);
		boolean result = check.checkLine();
		System.out.println(result);

	}

}
