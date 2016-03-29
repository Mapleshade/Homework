package ru.kpfu.itis.group11506.stack;

public class Check {

	private boolean result = false;
	private char[] array;
	private LinkedStack<Character> linkedStack = new LinkedStack<>();

	public boolean matching(char linkedElement, char arrayElement) {
		if ((linkedElement == '{') && (arrayElement == '}')) {
			return true;
		}
		if ((linkedElement == '(') && (arrayElement == ')')) {
			return true;
		}
		if ((linkedElement == '[') && (arrayElement == ']')) {
			return true;
		}
		return false;
	}

	public Check(String line) {
		array = line.toCharArray();
	}

	public boolean checkLine() {
		for (int i = 0; i < array.length; i++) {
			if ((array[i] == '{') || (array[i] == '(') || (array[i] == '[')) {
				linkedStack.push(array[i]);
			}
			if ((array[i] == '}') || (array[i] == ')') || (array[i] == ']')) {
				char previous = linkedStack.peek();
				boolean resultOfMatching = matching(previous, array[i]);
				if (resultOfMatching) {
					linkedStack.poll();
				}

			}
		}
		return result = linkedStack.empty();
	}
}
